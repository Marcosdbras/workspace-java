
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
		

	}

}
