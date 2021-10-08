
package lojaRoupas;
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa o comportamento de um cartão
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 * 
 *
 * 
 */

public class Cartao {

	private String numeroCartao;
	private int codigoseg;
	private String nomeCartao;
	private String dataVenc;
	private Cliente cliente;
	/**
	 * Esta classe implementa o comportamento de um cartão. Portanto ela
	 * contém os atributos de um cartão como nome do cartão, número do cartão,codigo de segurança
	 * e data de vencimento.Além disso, ela armazena  os dados na maneira em que será exibido.
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Cliente cliente = new Cliente("Guilherme N Silva", "1234392820","123","10/2024);
	 * 
	 * 
	 * 
	 * @param n é uma string que será armazenada o número do cartão
	 * @param i é um inteiro que será armazenado o código  do cartão
	 * @param no é uma string que será armazenada o nome  do cartão
	 * @param d é uma string que será armazenada a data de vencimento do cartão
	 * 
	 * 
	 */
	
	public Cartao (String n, int i , String no , String d  ) {
		numeroCartao=n;
		codigoseg=i;
		nomeCartao=no;
		dataVenc=d;
	}
	
	public String toString() {
		return "Nome do cartao:  "+ nomeCartao +" \n Número do cartao: "+ numeroCartao + " \n Código de seguranca: "+ codigoseg + " \n Data de vencimento: "+ dataVenc;
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao=numeroCartao;
	}
	
	public int getCodigoseg() {
		return codigoseg;
	}
	
	public void setCodigoseg(int codigoseg) {
		this.codigoseg=codigoseg;
	}
	
	public String getNomeCartao() {
		return nomeCartao;
	}
	
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao=nomeCartao;
	}
	
	public String getDataVenc() {
		return dataVenc;
	}
	
	public void setDataVenc(String dataVenc) {
		this.dataVenc=dataVenc;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		 this.cliente=cliente;
	}
}