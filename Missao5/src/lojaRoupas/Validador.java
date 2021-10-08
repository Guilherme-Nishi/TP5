package lojaRoupas;
/**
 * Componente Curricular:Orienta��o a objetos
 * Esta classe implementa o comportamento de um funcion�rio
 * @author Guilherme Nishimura Da Silva
 * @author Guilherme Evangelista Ferreira dos Santos
 * @version 1.0(oct 2021)
 * 
 *
 * 
 */
public class Validador {
	/**
	 * Esta classe implementa o comportamento de um Validador. Portanto ela
	 * valida o email,nome e cart�o.
	 * 
	 * Exemplo de uso:
	 *
	 * Validador v = new Validador();
	 * 
	 * 
	 * 
	 * @param email � uma string que ser� armazenada o email a ser validado
	 * @return aux a ser validado em true ou false nas condi��es colocadas
	 */
	public boolean validaEmail(String email) {
		boolean aux=true;
		if(email.isEmpty()) {
			
			aux=false;
		}
		
		if(email.contains("0")) {
			
			aux=false;
		}
		
		if(email.startsWith("0")) {
			
			aux=false;
		}
		return aux;
		
		
	}
	/**
	 * 
	 * 
	 * 
	 * @param nome � uma string que ser� armazenada o nome a ser validado
	 * @return aux a ser validado em true ou false nas condi��es colocadas
	 */
	public boolean validaNome(String nome) {
		boolean aux=true;
		
		if(nome.startsWith("0")||nome.startsWith("1")||nome.startsWith("2")||nome.startsWith("3")||nome.startsWith("4")||nome.startsWith("5")||nome.startsWith("6")||nome.startsWith("7")||nome.startsWith("8")||nome.startsWith("9")) {
			aux=false;
		}
		if(nome.isEmpty()) {
			
			aux=false;
		}
		
		
		
		
		
		
		return aux;
		
		
		
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param preco � uma double que ser� armazenada o nome a ser validado
	 * @return aux a ser validado em true ou false nas condi��es colocadas
	 */
	public boolean validaPreco(double preco) {
		boolean aux=true;
		
		if(preco==0||preco ==0.00) {
			aux=false;
		}
		
		return false;
		
		
	}
}

