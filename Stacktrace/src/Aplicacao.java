
public class Aplicacao {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        /*
         * Rastrear erros
         * */ 
		
		Pista p = new Pista();
		try {
			p.iniciar();
		} catch (PistaException e) {
			
			e.printStackTrace();
		}
		
	}

}
