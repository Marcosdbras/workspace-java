
public class ContadorStatic {
  private static int valor;
  
  // Bloco abaixo Static só é acionado a primeira vez que a classe é utilizada, portanto, este recurso po ser usado para inicializar valor entre outros. 
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
