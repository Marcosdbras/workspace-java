
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Ferrari f = new Ferrari();
		Rota rota = new Rota();
		rota.ir(f);
		
		
		AnelBrilhante a = new AnelBrilhante();
		Vendedor v = new Vendedor();
		v.mostrarPreco(f);
		v.mostrarPreco(a);
		
		Porsche p = new Porsche();
		
		/*
		 * 
		 * C�digo abaixo foi implementado na interface Automovel
		 * 
		 * */
		f.derrapar();
		p.derrapar();
		
		/*
		 * C�digo abaixo chama um m�todo est�tico dentro da interface Automovel
		 * 
		 * */
		int vm = Automovel.getVelocidadeMaxima();

		System.out.println("Velocidade M�xima: "+vm);
	}

}
