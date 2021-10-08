
package lojaRoupas;

/**
* Componente Curricular:Orienta��o a objetos
* Esta classe implementa o comportamento de uma Categoria
* @author Guilherme Nishimura Da Silva
* @author Guilherme Evangelista Ferreira dos Santos
* @version 1.0(oct 2021)
*
* 
*/

public class Categoria {
	private String tamanhoProduto;
	private String classifica�aoProdutoSexo;
	private String  classifica�aoProdutoEtaria;
	
	/**
	 * Esta classe implementa o comportamento da categoria do produto. Portanto ela
	 * cont�m os atributos de uma categoria como Tamanho do produto, g�nero do cart�o,
	 * classifica��o etaria do produto.Al�m disso, ela armazena  os dados na maneira em que ser� exibido no produto.
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Categoria categoria = new Categoria(" G","Masculino","Infantil");
	 * 
	 * 
	 * 
	 * @param t � uma string que ser� armazenada o n�mero do cart�o
	 * @param cla � um inteiro que ser� armazenado o c�digo  do cart�o
	 * @param et � uma string que ser� armazenada o nome  do cart�o
	 * 
	 * 
	 * 
	 */
	
	
	public Categoria (String t , String cla , String et) {
		tamanhoProduto=t;
		classifica�aoProdutoSexo=cla;
		classifica�aoProdutoEtaria=et;
	}
	
	public String toString() {
		return "\nO tamanho do produto : " + tamanhoProduto+" \nGenero : "+classifica�aoProdutoSexo+"  \nFaixa etaria : "+ classifica�aoProdutoEtaria;
	}
	
	public String getTamanhoProduto() {
		return tamanhoProduto;
	}
	
	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto=tamanhoProduto;
	}
	
	public String getClassifica�aoProdutoSexo() {
		return classifica�aoProdutoSexo;
	}
	
	public void setClassifica�aoProdutoSexo(String classifica�aoProdutoSexo) {
		this.classifica�aoProdutoSexo=classifica�aoProdutoSexo;
	}
	
	public String getClassifica�aoProdutoEtaria() {
		return classifica�aoProdutoEtaria;
	}
	
	public void setClassifica�aoProdutoEtaria(String classifica�aoProdutoEtaria) {
		this.classifica�aoProdutoEtaria=classifica�aoProdutoEtaria;
	}
}