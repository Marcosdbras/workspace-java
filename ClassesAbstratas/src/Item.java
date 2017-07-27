
public abstract class Item {
  private int posX;
  private int posY;
  
  /*
   * Toda classe abstrata n�o pode ser estanciado
   * Todo m�todo abstrado n�o pode ser implemento, s� tem assinatura
   * Voc� n�o pode ter metodos abstratos em classes n�o abstratas
   * por�m, vc pode ter m�todos n�o abstratos numa classe n�o abstratas
   * exemplos de getters e setter numa classe abstrata
   * 
   * */
  
//Somente assinatura do m�todo, pois � abstract
public abstract void pegar();


//Implementa��o de m�todos n�o abstratos
public int getPosX() {
	return posX;
}

public void setPosX(int posX) {
	this.posX = posX;
}

public int getPosY() {
	return posY;
}

public void setPosY(int posY) {
	this.posY = posY;
} 
  
  
  
}
