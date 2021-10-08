package controle;



import lojaRoupas.*;

public class ControleFuncionario {
	private Funcionario[] p;
	private int qtdFuncionario;

	public ControleFuncionario(ControleDados d) {
		p = d.getFuncionario();
		qtdFuncionario= d.getqtdFunc();
	}

	public String[] getNomeFunc() {
		String[] s = new String[qtdFuncionario];
		for(int i = 0; i < qtdFuncionario; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}
	public int getQtd() {
		return qtdFuncionario;
	}

	public void setQtd(int qtd) {
		this.qtdFuncionario = qtd;
	}

	public String getNome(int i) {		
		return p[i].getNome();
	}

	public String getId(int i) {
		String numId =p[i].getSenha();
		return numId;
	}

	
	public Endereço getEndeco(int i) {
		return p[i].getEndereço();
	}
	
	

	public void setQtdCliente(int qtdCliente) {
		this.qtdFuncionario = qtdCliente;
	}
	
	
}