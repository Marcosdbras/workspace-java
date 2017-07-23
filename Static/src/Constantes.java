
public class Constantes {
  
  //Defini��o do valor da constante de forma definitiva 
  public static final double MEDIA_GERAL = 7.5;	
 
  //Defini��o de vari�vel
  public static final double MEDIA_DA_PROVA;
  public static final double TOTAL;
  
  //Defni��o de vari�vel local
  private static double total = 7;
  
  static{

	  //Atribui��o uma �nica vez 
	  MEDIA_DA_PROVA = 7.0;
	  
	  //Constante     Variavel / Valor pode ter vindo de algum calculo
	  TOTAL       =   total;
	  
  }
}
