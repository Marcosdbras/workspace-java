package thread;

public class Aplicacao {

	public static void main(String[] args) {
		
		/*
		 * Como iniciar uma thread simples
		 * 
		 * Neste caso de intercalação de thread principal e outra secundária,
		 * não tem como garantir qual irá executar primeiro
		 * 
		 * Toda Thread extendida da classe de mesmo nome não consegue extender de mais ninguem,
		 *  
		 * */
		Contador c = new Contador();
		c.start();
		
		/*
		 * Execução da thred principal
		 * 		  
		 * */		
		for (int i = 0; i < 10; i++) {
		   System.out.println(" Principal Thread => "+i);
		   try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		   
		/*
		 * Neste outro exemplo eu consigo colocar 
		 * diversas implements na classe ContadorRunnable
		 * 
		 * */   
		ContadorRunnable r = new ContadorRunnable();
		Thread t = new Thread(r);
		t.start();
		   
		}
		
		

	}

}
