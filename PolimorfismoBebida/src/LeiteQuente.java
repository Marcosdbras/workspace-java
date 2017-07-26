
public class LeiteQuente extends Bebida {
  /*
   * O construtor de Bebida espera 2 parâmetros, sendo eles
   * nome e aquecer
   * 
   * */
	
  public LeiteQuente() {
	  super("Leite Quente", true);
  }	
  
  @Override
	public void preparar() {
      System.out.println("Pegando um copo");
      System.out.println("Colocando o leite no copo");
	}
  
}
