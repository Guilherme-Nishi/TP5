package controle;



import lojaRoupas.*;
/**
 * Componente Curricular:Orientação a objetos
 * Esta classe implementa o controle do cliente
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 *
 * 
 */
public class ControleCliente {
	private Cliente[] p;
	private int qtdCliente;
	/**
	 * Esta classe implementa o comportamento de controle de dados do cliente. 
	 * Ela faz o controle do cliente como adicionar,excluir e alterar.
	 * 
	 * @param d é um parâmetro da classe ControleDados que serve para referencia-la
	 * 
	 * 
	 * 
	 * 
	 */

	public ControleCliente(ControleDados d) {
		p = d.getCliente();
		qtdCliente = d.getqtdclient();
	}

	public String[] getNomeCliente() {
		String[] s = new String[qtdCliente];
		for(int i = 0; i < qtdCliente; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}
	public int getQtd() {
		return qtdCliente;
	}

	public void setQtd(int qtd) {
		this.qtdCliente = qtd;
	}

	public String getNome(int i) {		
		return p[i].getNome();
	}

	public String getSenha(int i) {
		String numSenha = String.valueOf(p[i].getSenha());
		return numSenha;
	}

	public String getEmail(int i) {
		
		return p[i].getEmail();
	}

	public Endereço getEndeco(int i) {
		return p[i].getEndereço();
	}
	
	public Cartao getCartao(int i) {
		return p[i].getCartao();
	}

	public void setQtdCliente(int qtdCliente) {
		this.qtdCliente = qtdCliente;
	}
	
	
}
