
public interface Automovel {
  /*
   * Primeiro crio a interface e as assinaturas dos métodos sempre como publica
   * 
   * Métodos não são implementados em interfaces, salvo exceção
   * è definido assinatura e não implementemos
   * as implementações são no método
   * 
   * Focamos o que faz a classe e não em como faz
   *  
   * */
	
	public void viraEsquerda();
	public void viraDireita();
	public void acelerar();
	public void frear();
	
	/*
	 * O métodos abaixo estão sendo compartilhados pelas classes
	 * que utilizam esta interface 
	 * 
	 * */
	
	default void derrapar() {
		acelerar();
		acelerar();
		frear();
	}
	
	/*
	 * O código abaixo compartilha o método em todas a classes
	 * que chama esta interface, porém sem instanciar um objeto
	 * pois, utiliza a palvavra chave static
	 * 
	 * */
	
	 static int getVelocidadeMaxima() {
		 return 300;
	 }
	
	
}
