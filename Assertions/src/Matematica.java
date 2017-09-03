
public class Matematica {

    public static void calcularBhaskara(double a, double b, double c, ResultadoBhaskara r) {
	   
    	double delta = calcularDelta(a,b,c);
    	
    	double r1 = (-b + Math.sqrt(delta)) / (2 * a);
    	double r2 = (-b - Math.sqrt(delta)) / (2 * a);
    	
    	r.setValores(r1, r2);
		
	}
	
	private static double calcularDelta(double a, double b, double c) {
       
		double delta = (b * b) - (4 * a * c);
		
		
		/*
		 * assert é somente utilizado em ambiente de teste,
		 * quando o programador quer garantir que o programa
		 * vai prosseguir se atender uma determinada situação
		 * nunca utiliza-la em produção
		 * 
		 * Caso delta seja negativo irá lançar um erro e não vai seguir o fluxo
		 * até que o programador resolva o problema
		 * 
		 * 
		 * */
		
		assert delta > 0 : "O valor de delta é "+delta+" portanto, delta faz parte dos números imaginários e não pode ser calculado raiz quadrada" ;
		
		return delta;
		
	}
	
}
