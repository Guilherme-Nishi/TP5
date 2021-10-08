package lojaRoupas;
/**
 * Componente Curricular:Orientação a objetos
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
	private Endereço endereco;
	
	/**
	 * Esta classe implementa o comportamento de um cliente. Portanto ela
	 * contém os atributos de um cliente que extende de uma pessoa como nome,
	 * senha,email,endereço e cartão.Ela armezena como os
	 * dados serão apresentados
	 * 
	 * Exemplo de uso:
	 *
	 * Cliente cliente = new Cliente("Cristiano Ronaldo","22131236#4","messi.@hotmail.com",endereço,cartão);
	 * 
	 * 
	 * 
	 * @param n é uma string que será armazenada o nome do cliente
	 * @param s é uma string que será armazenada a senha  do cliente
	 * @param ec é uma string que será armazenada o email  do cliente
	 * @param ed2 é um parâmetro da classe Endereço que será armazenada o endereço  do cliente
	 * @param ca é um parâmetro da classe Cartão que será armazenada o cartão  do cliente
	 * 
	 */
	public Cliente (String n,String s,String ec,Endereço ed2,Cartao ca) {
		nome=n;
		senha=s;
		emailCliente=ec;
		endereco=ed2;
		cartaoCliente=ca;
		
		

	}
	
	//Como ela será apresentada
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
	public Endereço getEndereco(){
		return endereco;
		
	}
	
	public void   setEndereço(Endereço endereco) {
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