package controle;



import lojaRoupas.*;
/**
* Componente Curricular:Orientação a objetos
* Esta classe implementa o comportamento de Controle
* @author Guilherme Nishimura Da Silva
* @author Guilherme Evangelista Ferreira dos Santos
* @version 1.0(oct 2021)
*
* 
*/
public class ControleFuncionario {
	private Funcionario[] p;
	private int qtdFuncionario;
	/**
	 * Esta classe implementa a interface de controle de funcionários. 
	 * 
	 * 
	 * 
	 * 
	 * @param d é um parâmetro que  referencia a classe ControleDados
	 * 
	 * 
	 */
	public ControleFuncionario(ControleDados d) {
		p = d.getFuncionario();
		qtdFuncionario= d.getqtdFunc();
	}
	/**
	 * Esta classe implementa a interface de controle de funcionários. 
	 * 
	 * 
	 * 
	 * 
	 * @return s  irá retornar a string anterior
	 * 
	 * 
	 */
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