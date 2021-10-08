package lojaRoupas;

public class Validador {
	
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
	public boolean validaPreco(double preco) {
		boolean aux=true;
		
		if(preco==0||preco ==0.00) {
			aux=false;
		}
		
		return false;
		
		
	}
}

