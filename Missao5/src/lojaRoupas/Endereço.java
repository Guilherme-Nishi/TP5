package lojaRoupas;
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa o comportamento de um endereço
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 * 
 */

public class Endereço {
	
	private String cep;
	private String rua;
	private int numero;
	private String complemento;
	
	/**
	 * Esta classe implementa o comportamento de um endereço. Portanto ela
	 * contém os atributos de um endereço  como CEP,rua,Número,complemento.Ela armezena como os
	 * dados serão apresentados
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * Endereço endereço = new Endereço("72153345","Avenida Alfa","14","Em frente ao shopping JK");
	 * 
	 * 
	 * 
	 * @param cp é uma string que será armazenada o CEP do cliente
	 * @param r é uma string que será armazenada a rua  do cliente
	 * @param n é um inteiro que será armazenado o numero da Residência do cliente
	 * @param c é uma string da que será armazenada o Complemento da Residência  do cliente
	 * 
	 */
	
	public Endereço (String cp , String r , int n , String c) {
		cep=cp;
		rua=r;
		numero=n;
		complemento=c;
	}
	
	public String toString() {
		return "\nCEP :" + cep + " \nRua:" + rua + "   \nNúmero da casa: "+ numero+ "  \n Complemento: "+ complemento;
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