package lojaRoupas;
/**
 * Componente Curricular:Orienta��o a objetos
 * Esta classe implementa o comportamento de um endere�o
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 * 
 */

public class Endere�o {
	
	private String cep;
	private String rua;
	private int numero;
	private String complemento;
	
	/**
	 * Esta classe implementa o comportamento de um endere�o. Portanto ela
	 * cont�m os atributos de um endere�o  como CEP,rua,N�mero,complemento.Ela armezena como os
	 * dados ser�o apresentados
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Endere�o endere�o = new Endere�o("72153345","Avenida Alfa","14","Em frente ao shopping JK");
	 * 
	 * 
	 * 
	 * @param cp � uma string que ser� armazenada o CEP do cliente
	 * @param r � uma string que ser� armazenada a rua  do cliente
	 * @param n � um inteiro que ser� armazenado o numero da Resid�ncia do cliente
	 * @param c � uma string da que ser� armazenada o Complemento da Resid�ncia  do cliente
	 * 
	 */
	
	public Endere�o (String cp , String r , int n , String c) {
		cep=cp;
		rua=r;
		numero=n;
		complemento=c;
	}
	
	public String toString() {
		return "\nCEP :" + cep + " \nRua:" + rua + "   \nN�mero da casa: "+ numero+ "  \n Complemento: "+ complemento;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep=cep;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua=rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento=complemento;
	}
}