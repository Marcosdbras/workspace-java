import java.util.Random;

public class Produtor extends Thread {
    
	/*Então o produzir fica produzindo números randomicos
	 *para uso de consumir 
	 * 
	 * Static para todosprodutores referenciem o mesmo atributo*/
	private static Random random = new Random();
	private Buffer buffer;    
    
    
    
    public Produtor(Buffer buffer) {
		
		this.buffer = buffer;
	}

	@Override
    public void run() {
       while (true) {
    	  
    	   buffer.produzir(random.nextInt(10));
    	   
    	   try {
    		   
			  Thread.sleep(random.nextInt(300));
			  
    	   } catch (InterruptedException e) {
    		   
			  e.printStackTrace();
			  
    	   }
    	   
    	   
       }
    
    }
    
}
