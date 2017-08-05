
public class Pista {
	public void iniciar() throws PistaException {
		Automovel a = new Automovel();
		try {
			a.acelerar(100);
			a.acelerar(90);
		} catch (AcimaVelocidadeMaximaException e) {
			
			/*
			 * Aqui está transformando uma exception em outra,
			 * sendo que a Pista Exception tem os métodos da 
			 * super classe Exception implementada nela
			 * 
			 * Aqui está havendo um inner Exception ou seja
			 * uma exceção está causando outra
			 * 
			 * */
			throw new PistaException("Problema na pista", e);
			
		}
		
		
	}
}
