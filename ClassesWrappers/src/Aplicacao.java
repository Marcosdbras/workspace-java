
public class Aplicacao {

	/*Tipo primitivos: double, int, float, boolean
	 *Tipos não primitivos: Classes, Interfaces, Enums 
	 * */
	
	
	public static void main(String[] args) {
		
		/*Neste caso estou embrulhando um valor int dentro de um objeto
		 * ou seja, o numero int foi transportado para o mundo dos objetos
		 * para que possa ser utilizado no método imprimir
		 * que por sua vez recebe como parâmetro somente objetos
		 * 
		 * Cada tipo primitivo do java tem seu equivalente classe wrappers
		 * 
		 * */
		Integer i1 = new Integer(20);
		
		imprimir(i1);
		
		Double i2 = new Double(23.5);
		imprimir(i2);
		
		
		/* Neste caso ocorre uma conversão interna no java de string para integer
		 * Se o java não puder converter a string por ser realmente uma literal, ex. "abc"
		 * o interpretador lançará um exceção
		 * */		
		Integer i3 = new Integer("35");
		imprimir(i3);
		
		
		
		/*Neste caso não ocorrerá erro, pois o java está utilizando recurso de autoboxing
		 * 
		 * */
		imprimir(80);
		
		
		/*Extrair tipo primitivo*/
		int x = i1.intValue();
		double y = i2.doubleValue();
		
		
		/*Conversão de tipos*/
		int v1 = Integer.parseInt("345");
		float v2 = Float.parseFloat("23.4");
		
		String bin = "0111";
		int v3 =Integer.parseInt(bin,2);
		
		String bin2 = Integer.toBinaryString(7);
		
		
		
		
		
	}
	
	private static void imprimir(Object obj) {
		
		System.out.println(obj);
		
	}

}
