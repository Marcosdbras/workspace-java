
public class Aplicacao {
  public static void main(String[] args) {
	Object o1 = new Object();
	Object o2 = new Object();
	
	
	/*
	 * Lança Runtimeexception , portanto, não é necessário assitar throws
	 * Toda Runtimeexception deve ser tratada
	 * para que a execução termine amigavelmente 
	 * */
	
	try {
		boolean iguais = Comparador.Comparar(null, o2);
		System.out.println(iguais);	
	} catch (Exception e) {
		System.out.println("O objeto é nulo");
	}
	
	
}
}
