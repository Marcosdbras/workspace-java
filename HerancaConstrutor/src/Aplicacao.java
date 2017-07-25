
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Carro c = new Carro();
		c.setAno(2000);
		c.setModelo("Brasilia");
		c.setMarca("VW");
		c.setQuatroPortas(true);		
		c.imprimirDados();
		c.buzinar();
		
		
		Carro b = new Carro("VW","Fusca",1974);
		
		
		b.imprimirDados();
		b.buzinar();
		
		Motocicleta m = new Motocicleta();
		m.setAno(2013);
		m.setModelo("GSR125");
		m.setMarca("Suzuki");
		m.imprimirDados();
		m.buzinar();		
		
		Caminhao cam = new Caminhao();
		cam.setAno(1974);
		cam.setMarca("Ford");
		cam.setModelo("Cargo");
		cam.imprimirDados();
		cam.buzinar();

	}

}
