package lojaRoupas;
/**
* Componente Curricular:Orienta��o a objetos
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
	protected Endere�o endereco ;
	/**
	 * Esta classe abstrata implementa o comportamento de uma pessoa. Portanto ela
	 * cont�m os atributos de um pessoa  como nome,senha,senha,endere�o que ser�o extendidos
	 * para a classe Funcion�rio e Cliente.
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
	
	public Endere�o getEndere�o() {
		return endereco;
		}
	public void setEndereco(Endere�o endereco) {
		this.endereco=endereco;	
			
		}
	
	
}