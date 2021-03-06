
public class Aplicacao {

	public static void main(String[] args) {
		/*
		 * Autoboxing funciona automáticamente do java 1.8 para cima
		 * 
		 * 
		 * */
		Handler h = new Handler();
		h.setObj("abc");
		String s = (String) h.getObj();
		System.out.println(s);
		
		
		/*Implementação antes do java 1.8*/
		Handler h1 = new Handler();
		h1.setObj(new Integer(10));
		Integer s1 = (Integer) h1.getObj();
		int v1 = s1.intValue();
		System.out.println(v1);
		
		
		Integer num = new Integer(40);
		int numx = num.intValue();
		numx++;
		Integer num2 = new Integer(numx);
        System.out.println(num2);
		
		/*Funciona somente do java 1.8 em diante*/
		Handler h2 = new Handler();
		h2.setObj(10);
		int v2 = (int) h2.getObj();
		System.out.println(v2);
		
		
		Double d1 = new Double(20);
		Double d2 = new Double(5.5);
		
		System.out.println(somar(d1,d2));

		Integer numero = new Integer(50);
		numero++;
		System.out.println(numero);
		
		
		/*Aqui está sendo usado wrappers
		 * Lembresse que tipo primitivo será
		 * sempre em minúsculo
		 * */
		Integer numero1 = 40;
		
	}

private static double somar(double a, double b) {
	return a + b;
}	
	
	
}
