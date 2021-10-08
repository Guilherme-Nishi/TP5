package lojaRoupas;
import java.util.*;
/**
 * Componente Curricular:Orienta��o a objetos
 * Esta classe implementa o comportamento de um funcion�rio
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 * 
 */
public class Funcionario extends Pessoa {
	private String identificador;
	private Endere�o endereco;
	/**
	 * Esta classe implementa o comportamento de um Funcion�rio. Portanto ela
	 * cont�m os atributos de um Funcion�rio  como nome,identificador,senha,endere�o.Ela armezena como os
	 * dados ser�o apresentados
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Funcionario funcionario = new Funcionario("Pedro Coelho","1000","senha",endere�o);
	 * 
	 * 
	 * 
	 * @param n � uma string que ser� armazenada o nome do funcion�rio
	 * @param i � uma string que ser� armazenada o identificador do funcion�rio
	 * @param s � uma string que ser� armazenada a senha do funcion�rio
	 * @param ed1 � um par�metro da classe Endere�o da que ser� armazenada o endere�o do funcion�rio
	 * 
	 */
	
	public Funcionario(String n,String i,String s,Endere�o ed1){
		nome=n;
		identificador=i;
		senha=s;
		endereco=ed1;
		
	}
	
	

	public String toString() {
		return "Nome do funcion�rio: " + nome + " \nID do funcion�rio:" + identificador+" \nSenha do funcion�rio "+senha+endereco;
	}
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador=identificador;
	}
	public  String getNome(){
		return nome;
		
	}
	
	public void   setNome(String nome) {
		this.nome=nome;
		
	}
	
	public Endere�o getEndere�o(){
		return endereco;
		
	}
	
	public void   setEndereco(Endere�o endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
}