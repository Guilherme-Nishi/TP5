package lojaRoupas;
/**
* Componente Curricular:Orientação a objetos
* Esta classe implementa o comportamento de uma venda
* @author Guilherme Nishimura Da Silva
* @author Guilherme Evangelista Ferreira dos Santos
* @version 1.0(oct 2021)
*
*
* 
*/

public class Venda {
	private String numerovenda;
	private String nomeProduto;
	private String nomeCliente;
	/**
	 * Esta classe implementa o comportamento de uma venda. Portanto ela
	 * contém os atributos de uma venda como número da venda, nome do produto,
	 * nome do cliente .Além disso, ela armazena  os dados na maneira em que será exibido .
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Venda venda = new Venda(" 10001","Calça Jeans","Guilherme");
	 * 
	 * 
	 * 
	 * @param n é uma string que será armazenada o número da venda
	 * @param p é um uma string que será armazenada o nome do produto
	 * @param c é uma string que será armazenada o nome  do cliente
	 * 
	 * 
	 * 
	 */
	
	public Venda (String n , String p , String c) {
		numerovenda=n;
		nomeProduto=p;
		nomeCliente=c;
	}
	
	public String toString() {
		return "Venda - "+ numerovenda + nomeProduto + "Cliente" + nomeCliente;
	}
	
	public String getNumerovenda() {
		return numerovenda;
	}
	
	public void setNumeroVenda(String numerovenda) {
		this.numerovenda=numerovenda;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setProduto(String nomeProduto) {
		this.nomeProduto=nomeProduto;
	}
	
	public String getNomeCliente(){
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente=nomeCliente;
	}
}