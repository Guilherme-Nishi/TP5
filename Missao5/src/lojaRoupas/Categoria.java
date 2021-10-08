
package lojaRoupas;

/**
* Componente Curricular:Orientação a objetos
* Esta classe implementa o comportamento de uma Categoria
* @author Guilherme Nishimura Da Silva
* @author Guilherme Evangelista Ferreira dos Santos
* @version 1.0(oct 2021)
*
* 
*/

public class Categoria {
	private String tamanhoProduto;
	private String classificaçaoProdutoSexo;
	private String  classificaçaoProdutoEtaria;
	
	/**
	 * Esta classe implementa o comportamento da categoria do produto. Portanto ela
	 * contém os atributos de uma categoria como Tamanho do produto, gênero do cartão,
	 * classificação etaria do produto.Além disso, ela armazena  os dados na maneira em que será exibido no produto.
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Categoria categoria = new Categoria(" G","Masculino","Infantil");
	 * 
	 * 
	 * 
	 * @param t é uma string que será armazenada o número do cartão
	 * @param cla é um inteiro que será armazenado o código  do cartão
	 * @param et é uma string que será armazenada o nome  do cartão
	 * 
	 * 
	 * 
	 */
	
	
	public Categoria (String t , String cla , String et) {
		tamanhoProduto=t;
		classificaçaoProdutoSexo=cla;
		classificaçaoProdutoEtaria=et;
	}
	
	public String toString() {
		return "\nO tamanho do produto : " + tamanhoProduto+" \nGenero : "+classificaçaoProdutoSexo+"  \nFaixa etaria : "+ classificaçaoProdutoEtaria;
	}
	
	public String getTamanhoProduto() {
		return tamanhoProduto;
	}
	
	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto=tamanhoProduto;
	}
	
	public String getClassificaçaoProdutoSexo() {
		return classificaçaoProdutoSexo;
	}
	
	public void setClassificaçaoProdutoSexo(String classificaçaoProdutoSexo) {
		this.classificaçaoProdutoSexo=classificaçaoProdutoSexo;
	}
	
	public String getClassificaçaoProdutoEtaria() {
		return classificaçaoProdutoEtaria;
	}
	
	public void setClassificaçaoProdutoEtaria(String classificaçaoProdutoEtaria) {
		this.classificaçaoProdutoEtaria=classificaçaoProdutoEtaria;
	}
}