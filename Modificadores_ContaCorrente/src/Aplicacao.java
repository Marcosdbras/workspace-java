
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(5433);
		c.setAtiva(true);
		
		c.depositar(5000);
		
		
		System.out.println(c.getSaldo());
		
		
		

	}

}
