package controle;

import lojaRoupas.*;
/**
* Componente Curricular:Orientação a objetos
* Esta classe implementa o controle de dados
* @author Guilherme Nishimura Da Silva
* @author Guilherme Evangelista Ferreira dos Santos
* @version 1.0(oct 2021)
*
* 
*/
public class ControleDados {
	private Dados d = new Dados();
	/**
	 * Esta classe implementa o comportamento de controle de dados. Portanto ela
	 * faz o controle da dados da classe ControleCliente,ControleProduto,
	 * ControleVendas
	 * 
	 * 
	 */
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Produto[] getProduto() {
		return this.d.getProduto();
	}
	
	public int getqtdProduto() {
		return this.d.getQtdproduto();
	}
	
	public int getqtdclient() {
		return this.d.getqtdclient();
	}
	
	public Cliente[] getCliente() {
		return this.d.getCliente();
	}
	 public Venda[] getVenda() {
			
			return this.d.getVenda();
		}
	   public int getqtdvenda() {
			return this.d.getQtdvend();
		}
	
	   /**
		 * @param dadosCliente é uma String que faz o controle dos dados do cliente
		 * @return true se os dados forem anexados
		 * 
		 */

	public boolean inserirEditarCliente(String[] dadosCliente) {
		int ut = 1;
		if(ut==0) {
			return false;
		} else {
				Cliente p = new Cliente(dadosCliente[1], dadosCliente[2], dadosCliente[3],
						new Endereço(dadosCliente[4], dadosCliente[5], Integer.parseInt(dadosCliente[6]), dadosCliente[7]),
						new Cartao(dadosCliente[8],Integer.parseInt(dadosCliente[9]),dadosCliente[10],dadosCliente[11]));
				d.inserirEditacliente(p, Integer.parseInt(dadosCliente[0]));
				return true;
		}
	}
	/**
	 * @param dadosProduto é uma String que faz o controle dos dados do produto
	 * 
	 * @return true se os dados forem anexados
	 */
	// a posicao 0 do vetor dadosProduto indica onde os dados devem ser inseridos
	public boolean inserirEditarProduto(String[] dadosProduto) {
		int tu = 1;
		if(tu==0) {
			return false;
		} else {
				Produto a = new Produto(dadosProduto[1], Double.parseDouble(dadosProduto[2]),Integer.parseInt(dadosProduto[3]), 
						dadosProduto[4], new Categoria(dadosProduto[5],dadosProduto[6],dadosProduto[7]),dadosProduto[8],dadosProduto[9],Integer.parseInt(dadosProduto[10]));
				d.inserirEditarProduto(a, Integer.parseInt(dadosProduto[0]));
				
				return true;
		}
	}
	
	
	/**
	 * @param dadosVenda é uma String que faz o controle dos dados da venda
	 * 
	 * @return true se os dados forem anexados
	 */
	public boolean inserirEditarVenda(String[] dadosVenda) {
		int tu = 1;
		if(tu==0) {
			return false;
		} else {
				Venda b = new Venda(dadosVenda[1],dadosVenda[2],dadosVenda[3]);
						
						
				d.inserirEditarVenda(b, Integer.parseInt(dadosVenda[0]));
				return true;
		}
	}
	
	/**
	 * @param i  é um inteiro que serve para gerar um vetor
	 * @return true se os dados forem removidos
	 * 
	 */
	public boolean removerP(int i) {
		int qtdven = d.getQtdvend();
		String produtoRemovido = d.getProduto()[i].getNomeproduto();
		String aux;
		
		if(i == (d.getqtdproduto() - 1)) { // O aluno a ser removido está no final do array
			d.setQqtdproduto(d.getQtdproduto() - 1);
			d.getProduto()[d.getQtdproduto()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getProduto()[cont].getNomeproduto().compareTo(produtoRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getqtdproduto() - 1; j++) {
				d.getProduto()[j] = null;
				d.getProduto()[j] = d.getProduto()[j+1];
			}
			d.getProduto()[d.getqtdproduto()] = null;
			d.setQqtdproduto(d.getqtdproduto() - 1);
			return true;
		}
	}
	
}