package thread;

public class Contador extends Thread {
    
	/*
	 * CTRL + Space 
	 *    Auxilio de código
	 * 
	 * */
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
		
			System.out.println(" Thread Secundária => "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
}
