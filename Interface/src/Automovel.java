
public interface Automovel {
  /*
   * Primeiro crio a interface e as assinaturas dos m�todos sempre como publica
   * 
   * M�todos n�o s�o implementados em interfaces, salvo exce��o
   * � definido assinatura e n�o implementemos
   * as implementa��es s�o no m�todo
   * 
   * Focamos o que faz a classe e n�o em como faz
   *  
   * */
	
	public void viraEsquerda();
	public void viraDireita();
	public void acelerar();
	public void frear();
	
	/*
	 * O m�todos abaixo est�o sendo compartilhados pelas classes
	 * que utilizam esta interface 
	 * 
	 * */
	
	default void derrapar() {
		acelerar();
		acelerar();
		frear();
	}
	
	/*
	 * O c�digo abaixo compartilha o m�todo em todas a classes
	 * que chama esta interface, por�m sem instanciar um objeto
	 * pois, utiliza a palvavra chave static
	 * 
	 * */
	
	 static int getVelocidadeMaxima() {
		 return 300;
	 }
	
	
}
