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
	 * Esta classe implementa o comportamento do controle de dados. Portanto ela
	 * contém os atributos de um controle do Funcionário,cliente ,venda e produto.
	 * 
	 * 
	 * 
	 * Exemplo de uso:
	 *
	 * ControleDados dados = new ControleDados();
	 * 
	 * 
	 * 
	 * 
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
	
	public Funcionario[] getFuncionario() {
		return this.d.getFuncionarios();
	}
	
	public int getqtdFunc() {
		return this.d.getQtdfuncionarios();
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
		 * @param dadosCliente é um vetor de string que armazena para inserir e editar
		 * 
		 * 
		 * 
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
	 * @param dadosProduto  é um vetor de string que armazena para inserir e editar
	 * 
	 * 
	 * 
	 * 
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
	 * @param dadosFunc é um vetor de string que armazena para inserir e editar
	 * 
	 * 
	 * 
	 * 
	 */
	public boolean inserirEditarFunc(String[] dadosFunc) {
		int tu = 1;
		if(tu==0) {
			return false;
		} else {
				Funcionario a = new Funcionario(dadosFunc[1],dadosFunc[2],dadosFunc[3],new Endereço(dadosFunc[4] , dadosFunc[5] , Integer.parseInt(dadosFunc[6]) , dadosFunc[7])); 
						
				d.inserirEditarFunc(a, Integer.parseInt(dadosFunc[0]));
				
				return true;
		}
	}
	
	
	/**
	 * @param dadosVenda é um vetor de string que armazena para inserir e editar
	 * 
	 * 
	 * 
	 * 
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
	
	
	public boolean removerF(int i) {
		int qtdfun = d.getQtdfuncionarios();
		String produtoRemovido = d.getFuncionarios()[i].getNome();
		String aux;
		
		if(i == (d.getQtdfuncionarios() - 1)) { // O aluno a ser removido está no final do array
			d.setQtdfuncionarios(d.getQtdfuncionarios() - 1);
			d.getFuncionarios()[d.getQtdfuncionarios()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getFuncionarios()[cont].getNome().compareTo(produtoRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdfuncionarios() - 1; j++) {
				d.getFuncionarios()[j] = null;
				d.getFuncionarios()[j] = d.getFuncionarios()[j+1];
			}
			d.getFuncionarios()[d.getQtdfuncionarios()] = null;
			d.setQtdfuncionarios(d.getQtdfuncionarios() - 1);
			return true;
		}
	}
	
}