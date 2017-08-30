
public class Aplicacao {

	public static void main(String[] args) {
		
		/*Número variado de parâmetros*/
		imprimir("a");
		imprimir("a","b", "c");
		imprimir();
		
		String[] array = {"a","b","c"};
		imprimir(array);

	}
	
	/*Variação da quantidade de parâmetros*/
	private static void imprimir(String... textos) {
		
		for (int i = 0; i < textos.length; i++) {
			
			System.out.println(textos[i]);   
					
			
		}
		
		
		
	}

}
