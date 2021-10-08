package lojaRoupas;
import java.util.*;
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa o comportamento de um funcionário
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 * 
 */
public class Funcionario extends Pessoa {
	private String identificador;
	private Endereço endereco;
	/**
	 * Esta classe implementa o comportamento de um Funcionário. Portanto ela
	 * contém os atributos de um Funcionário  como nome,identificador,senha,endereço.Ela armezena como os
	 * dados serão apresentados
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Funcionario funcionario = new Funcionario("Pedro Coelho","1000","senha",endereço);
	 * 
	 * 
	 * 
	 * @param n é uma string que será armazenada o nome do funcionário
	 * @param i é uma string que será armazenada o identificador do funcionário
	 * @param s é uma string que será armazenada a senha do funcionário
	 * @param ed1 é um parâmetro da classe Endereço da que será armazenada o endereço do funcionário
	 * 
	 */
	
	public Funcionario(String n,String i,String s,Endereço ed1){
		nome=n;
		identificador=i;
		senha=s;
		endereco=ed1;
		
	}
	
	

	public String toString() {
		return "Nome do funcionário: " + nome + " \nID do funcionário:" + identificador+" \nSenha do funcionário "+senha+endereco;
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
	
	public Endereço getEndereço(){
		return endereco;
		
	}
	
	public void   setEndereco(Endereço endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
}