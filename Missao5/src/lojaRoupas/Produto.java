package lojaRoupas;

import java.util.*;
/**
* Componente Curricular:Orienta��o a objetos
* Esta classe implementa o comportamento de um produto
* @author Guilherme Nishimura Da Silva
* @author Guilherme Evangelista Ferreira dos Santos
* @version 1.0(oct 2021)
* 
*
* 
*/
public class Produto {

	private String nomeProduto;
	private double precoProduto;
	private int produtoEstoque;
	private String produtoCor;
	private String tamanhoProduto;
	private int numeroProduto;
	private Categoria categoria;
	private String marcaProduto;
	private String descri�aoProduto;
	private int avalia�aoProduto;
	private String produtoCamisa;
	private String produtoCalca;
	private String produtoBone;
	private String produtoMoletom;
	private String produtoTenis;
	/**
	 * Esta classe implementa o comportamento de um produto. Portanto ela
	 * cont�m os atributos de um produto  como nome,pre�o,estoque
	 * cor,categoria,marca,descri��o e numero.Ela armezena como os
	 * dados ser�o apresentados
	 * 
	 * Exemplo de uso:
	 *
	 * Produto produto = new Produto("Blusa inverno 2021","99.99","50","Amarelo",categoria);
	 * 
	 * 
	 * 
	 * @param nn � uma string que ser� armazenada o nome do produto
	 * @param p � um double que ser� armazenada o pre�o do produto
	 * @param e � um inteiro que ser� armazenada o estoque do produto
	 * @param c � uma string que ser� armazenada a cor do produto
	 * @param ca � um par�metro da classe Cateogira que ser� armazenada a categoria do produto
	 * @param ma � uma string que ser� armazenada a marca do produto
	 * @param des � uma string que ser� armazenada a descr��o do produto
	 * @param num � um inteiro que ser� armazenada o n�mero do produto
	 */
	
	public Produto(String nn,double p,int e,String c,Categoria ca, String ma, String des, int num ){
		nomeProduto=nn;
		precoProduto=p;
		produtoEstoque=e;
		produtoCor=c;
		categoria=ca;
		marcaProduto=ma;
		descri�aoProduto=des;
		numeroProduto=num;

	}
	
	public String toString() {
		return "Nome do produto: " + nomeProduto + " \nValor do produto:" +  precoProduto+" \nO estoque do produto �: "+produtoEstoque+"\nA cor do produto �:"+produtoCor+categoria ;
	}
	
	public String getNomeproduto() {
		return nomeProduto;
	}

	public void setNomeproduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPreco() {
		return precoProduto;
	}

	public void setPreco(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getEstoque() {
		return produtoEstoque;
	}

	public void setPreco(int produtoEstoque) {
		this.produtoEstoque =produtoEstoque;
	}
	public String getCor() {
		return produtoCor;
	}

	public void setPreco(String produtoCor) {
		this. produtoCor = produtoCor;
	}
	public String getTamanho() {
		return tamanhoProduto;
	}

	public void setTamanho(String tamanhoProduto) {
		this. tamanhoProduto =tamanhoProduto;
	}
	public int getNumero() {
		return numeroProduto;
	}

	public void setNumero(int numeroProduto) {
		this. numeroProduto =numeroProduto;
	}
	public Categoria getCategoria() {
		return categoria;
	}

	public void setcategoria(Categoria categoria) {
		this. categoria =categoria;
	}
	public String getMarca() {
		return marcaProduto;
	}

	public void setMarca(String marcaProduto) {
		this.marcaProduto =marcaProduto;
	}
	public String getDescricao() {
		return  descri�aoProduto;
	}

	public void setDescricao(String  descri�aoProduto) {
		this. descri�aoProduto = descri�aoProduto;
	}
	public int getAvaliacao() {
		return  avalia�aoProduto;
	}

	public void setDescricao(int avalia�aoProduto) {
		this. avalia�aoProduto = avalia�aoProduto;
	}
	public String getCamisa() {
		return produtoCamisa;
	}

	public void setCamisa(String produtoCamisa) {
		this.produtoCamisa =produtoCamisa;
	}
	public String getCalca() {
		return produtoCalca;
	}

	public void setCalca(String produtoCalca) {
		this.produtoCalca =produtoCalca;
	}
	public String getBone() {
		return produtoBone;
	}

	public void setBone(String produtoBone) {
		this.produtoBone =produtoBone;
	}
	public String getMoletom() {
		return produtoMoletom;
	}

	public void setMoletom(String produtoMoletom) {
		this.produtoMoletom =produtoMoletom;
	}
	public String getTenis() {
		return produtoTenis;
	}

	public void setTenis(String produtoTenis) {
		this.produtoTenis =produtoTenis;
	}
}