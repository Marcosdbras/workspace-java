
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Classe abstrata ser� a superclasse
		 * Uma classe abstrata n�o pode ter uma instancia direta
		 * Nada impede q eu pegue o tpo abstrato para referenciar
		 * 
		 * Item � um tipo gen�rico, ou seja, abstrato
		 * */
		Diamante d = new Diamante();
		d.pegar();
		
		Cogumelo c = new Cogumelo();
		c.pegar();
		
		Moeda m = new Moeda();
		m.pegar();
		
		Maca mc = new Maca();
		mc.pegar();
		
		Item maca = new Maca();
		maca.pegar();

		

	}

}
