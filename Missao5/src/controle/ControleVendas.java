package controle;

import lojaRoupas.*;
/**
* Componente Curricular:Orientação a objetos
* Esta classe implementa o comportamento de uma Controle de vendas
* @author Guilherme Nishimura Da Silva
* @author Guilherme Evangelista Ferreira dos Santos
* @version 1.0(oct 2021)
* 
*
* 
*/
public class ControleVendas {
	private Venda[] a;
	private int qtdVenda;
	/**
	 * Esta classe implementa o comportamento de controle de dados do produto. 
	 * Ela faz o controle do produto como adicionar,excluir e alterar.
	 * 
	 * @param d é um parâmetro da classe ControleDados que serve para referencia-la
	 * 
	 * 
	 * 
	 * 
	 */
	public ControleVendas(ControleDados d) {
		a = d.getVenda();
		qtdVenda = d.getqtdvenda();
		
	}
	
	public String[] getNomeVenda() {
		String[] s = new String[qtdVenda];
		for(int i = 0; i < qtdVenda; i++) {
			s[i] = a[i].getNumerovenda();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdVenda;
	}

	public void setQtd(int qtd) {
		this.qtdVenda = qtd;
	}
	
	public String getNumerovenda(int i) {		
		return a[i].getNumerovenda();
	}

	public int getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}
	
}
