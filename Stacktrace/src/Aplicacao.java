
public class Aplicacao {

	public static void main(String[] args)  {
		
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
