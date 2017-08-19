package br.util;

public class RandomUtils {
  
  /**
   * 
   * 
   * @param min : Recebe menor valor para ser sorteado
   * @param max : Recebe maior valor para ser sorteado 
   * @return    : Retorna número sorteado
   */
  public static final int nextInt(int min, int max) {
	  
	  /**/
	  int delta = max - min;
	  
	  /**/
	  return (int) (Math.random() * delta + min + 1 );
  }
  
  
}
