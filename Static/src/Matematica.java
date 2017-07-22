
public class Matematica {

	/*
	 * Static: n�o � permitito estanciar a classe para usar o metodo, logo, eu chamo o metodo direto da classe
	 * 
	 */ 
	public static double somar(double a, double b){
		return a + b;
	}
	
	public static double subtrair(double a, double b) {
		
		return a - b;
		
	}
	
	/*
	 * N�o Static: H� necessidade de instanciar o objeto para utilizar o metodo
	 * 
	 * */
	public double divisao(double a, double b) {
		
		return a / b;
		
	}
	
	public double mult(double a, double b) {
		
		return a * b;
		
	}
	
}
