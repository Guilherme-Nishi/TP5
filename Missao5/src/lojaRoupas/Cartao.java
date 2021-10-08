
package lojaRoupas;
/**
 * Componente Curricular:Orienta��o a objetos
 * Esta classe implementa o comportamento de um cart�o
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
	 * Esta classe implementa o comportamento de um cart�o. Portanto ela
	 * cont�m os atributos de um cart�o como nome do cart�o, n�mero do cart�o,codigo de seguran�a
	 * e data de vencimento.Al�m disso, ela armazena  os dados na maneira em que ser� exibido.
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Cliente cliente = new Cliente("Guilherme N Silva", "1234392820","123","10/2024);
	 * 
	 * 
	 * 
	 * @param n � uma string que ser� armazenada o n�mero do cart�o
	 * @param i � um inteiro que ser� armazenado o c�digo  do cart�o
	 * @param no � uma string que ser� armazenada o nome  do cart�o
	 * @param d � uma string que ser� armazenada a data de vencimento do cart�o
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
		return "Nome do cartao:  "+ nomeCartao +" \n N�mero do cartao: "+ numeroCartao + " \n C�digo de seguranca: "+ codigoseg + " \n Data de vencimento: "+ dataVenc;
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