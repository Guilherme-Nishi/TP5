package lojaRoupas;
/**
 * Componente Curricular:Orienta��o a objetos
 * Esta classe implementa o comportamento de um cliente extendido de uma pessoa
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 */

public class Cliente extends Pessoa {

	private String emailCliente;
	private Cartao cartaoCliente;
	private Endere�o endereco;
	
	/**
	 * Esta classe implementa o comportamento de um cliente. Portanto ela
	 * cont�m os atributos de um cliente que extende de uma pessoa como nome,
	 * senha,email,endere�o e cart�o.Ela armezena como os
	 * dados ser�o apresentados
	 * 
	 * Exemplo de uso:
	 *
	 * Cliente cliente = new Cliente("Cristiano Ronaldo","22131236#4","messi.@hotmail.com",endere�o,cart�o);
	 * 
	 * 
	 * 
	 * @param n � uma string que ser� armazenada o nome do cliente
	 * @param s � uma string que ser� armazenada a senha  do cliente
	 * @param ec � uma string que ser� armazenada o email  do cliente
	 * @param ed2 � um par�metro da classe Endere�o que ser� armazenada o endere�o  do cliente
	 * @param ca � um par�metro da classe Cart�o que ser� armazenada o cart�o  do cliente
	 * 
	 */
	public Cliente (String n,String s,String ec,Endere�o ed2,Cartao ca) {
		nome=n;
		senha=s;
		emailCliente=ec;
		endereco=ed2;
		cartaoCliente=ca;
		
		

	}
	
	//Como ela ser� apresentada
	public String toString() {
		return "\nNome do cliente: "+nome+" Senha do cliente: "+senha+" Email do cliente: "+emailCliente+endereco+cartaoCliente;
		
		//Gets e sets
	}
	public  String getNome(){
		return nome;
		
	}
	
	public void   setNome(String nome) {
		this.nome=nome;
		
	}
	
	public  Cartao getCartao(){
		return cartaoCliente;
		
	}
	
	public void   setCartao(Cartao cartaoCliente) {
		this.cartaoCliente=cartaoCliente;
		
	}
	public Endere�o getEndereco(){
		return endereco;
		
	}
	
	public void   setEndere�o(Endere�o endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getEmail(){
		return emailCliente;
		
	}
	
	public void   setEmail(String emailCliente) {
		this.emailCliente=emailCliente;
		
	}
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
	
	
}