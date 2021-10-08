package lojaRoupas;

import java.util.*;
/**
* Componente Curricular:Orientação a objetos
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
	private String descriçaoProduto;
	private int avaliaçaoProduto;
	private String produtoCamisa;
	private String produtoCalca;
	private String produtoBone;
	private String produtoMoletom;
	private String produtoTenis;
	/**
	 * Esta classe implementa o comportamento de um produto. Portanto ela
	 * contém os atributos de um produto  como nome,preço,estoque
	 * cor,categoria,marca,descrição e numero.Ela armezena como os
	 * dados serão apresentados
	 * 
	 * Exemplo de uso:
	 *
	 * Produto produto = new Produto("Blusa inverno 2021","99.99","50","Amarelo",categoria);
	 * 
	 * 
	 * 
	 * @param nn é uma string que será armazenada o nome do produto
	 * @param p é um double que será armazenada o preço do produto
	 * @param e é um inteiro que será armazenada o estoque do produto
	 * @param c é uma string que será armazenada a cor do produto
	 * @param ca é um parâmetro da classe Cateogira que será armazenada a categoria do produto
	 * @param ma é uma string que será armazenada a marca do produto
	 * @param des é uma string que será armazenada a descrção do produto
	 * @param num é um inteiro que será armazenada o número do produto
	 */
	
	public Produto(String nn,double p,int e,String c,Categoria ca, String ma, String des, int num ){
		nomeProduto=nn;
		precoProduto=p;
		produtoEstoque=e;
		produtoCor=c;
		categoria=ca;
		marcaProduto=ma;
		descriçaoProduto=des;
		numeroProduto=num;

	}
	
	public String toString() {
		return "Nome do produto: " + nomeProduto + " \nValor do produto:" +  precoProduto+" \nO estoque do produto é: "+produtoEstoque+"\nA cor do produto é:"+produtoCor+categoria ;
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
		return  descriçaoProduto;
	}

	public void setDescricao(String  descriçaoProduto) {
		this. descriçaoProduto = descriçaoProduto;
	}
	public int getAvaliacao() {
		return  avaliaçaoProduto;
	}

	public void setDescricao(int avaliaçaoProduto) {
		this. avaliaçaoProduto = avaliaçaoProduto;
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