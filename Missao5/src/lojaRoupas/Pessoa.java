package lojaRoupas;
/**
* Componente Curricular:Orientação a objetos
* Esta classe implementa o comportamento de uma pessoa
* @author Guilherme Nishimura Da Silva
* @author Guilherme Evangelista Ferreira dos Santos
* @version 1.0(oct 2021)
* 
*
* 
*/
public abstract  class Pessoa {

	protected String nome;
	protected String senha;
	protected Endereço endereco ;
	/**
	 * Esta classe abstrata implementa o comportamento de uma pessoa. Portanto ela
	 * contém os atributos de um pessoa  como nome,senha,senha,endereço que serão extendidos
	 * para a classe Funcionário e Cliente.
	 */
	
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome=nome;	
		
	}
	
	public String getSenha() {
		return senha;
		}
	public void setSenha(String senha) {
		this.senha=senha;	
			
		}
	
	public Endereço getEndereço() {
		return endereco;
		}
	public void setEndereco(Endereço endereco) {
		this.endereco=endereco;	
			
		}
	
	
}