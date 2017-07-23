
public class ContadorStatic {
  private static int valor;
  
  // Bloco abaixo Static s� � acionado a primeira vez que a classe � utilizada, portanto, este recurso po ser usado para inicializar valor entre outros. 
  static {
	  valor = 1;
  }
  
  public static void incrementar(){
	  valor++;
  }

public static int getValor() {
	return valor;
}


  
  
  
}
