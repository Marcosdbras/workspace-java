
public class Aplicacao {

	public static void main(String[] args) {
		
		/*
		 * Para o assert funcionar vc deve ir até a linha de comando
		 * e iniciar a aplicação da seguinte forma: 
		 * 
		 * java -ea aplicacao.java
		 * 
		 * ou se estiver no eclipse  vc deve ir na seta para baixo do 
		 *  
		 * 
		 * 1) Botão run
		 * 2) Run Configurations
		 * 3) Abrir a aba Arguments
		 * 4) Digitar na área VM Arguments o -ea
		 * 
		 *  observação: Você pode configurar um argumento em cada aplicação
		 *  sendo que uma não irá influenciar na outra
		 *  
		 * 
		 * */
		
		
		ResultadoBhaskara r = new ResultadoBhaskara();
		
		//double a = 1.0;
		
		//double b = 3.0;
		
		//double c = -4.0;
		
		double a = 1.0;
		
		double b = 2.0;
				
		double c = 16;
				
		
		
		Matematica.calcularBhaskara(a, b, c, r);
		
		System.out.println("R1 = "+r.getR1()+" R2= "+r.getR2());

	}
	
	

}
