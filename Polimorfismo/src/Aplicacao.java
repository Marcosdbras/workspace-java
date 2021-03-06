
public class Aplicacao {
 
	public static void main(String[] args) {
		/*
		 * Poliformismo � ideal pra se trabalhar de forma gen�rica
		 * 
		 * */
		Cachorro c = new Cachorro();
		c.falar();
		
		
		// o que vale � objeto criado na mem�ria: Cachorro
		Animal a = new Cachorro();
		a.falar(); 
		
		Animal b = new Cachorro();
		/*
		 * b.morder();
		 * 
		 * o m�todo acima n�o pode ser compilado, pois, 
		 * morder() pertence � classe Cachorro, por�m
		 * n�o pertence � animal 
		 * 
		 * 
		 * */
		if (b instanceof Cachorro) {
			
			Cachorro d = (Cachorro) b;			 
			d.morder();	
			
		}
		 
		 
		 /*
		  * O m�todo acima � compilado, pois,
		  * est� havendo um casting expl�cito 
		  * CUIDADO! Casting expl�cito tem um certo perigo
		  * pode dar erro na hora da execu��o
		  * 
		  * para garantir que n�o haver� erro de execu��o
		  * caso fa�a referencia de uma classe errada
		  * utilizar instanceof
		  * 
		  * */
		 
		  Cachorro e = new Cachorro();
		  Gato g = new Gato();
		
		  falar(e);
		  falar(g);
		  
		
	}
	
	
	private static void falar (Animal a) {
		a.falar();
	}
	
	
  
}
