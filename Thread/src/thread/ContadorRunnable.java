package thread;

public class ContadorRunnable implements Runnable{

	@Override
	public void run() {
		for (int x = 0; x < 10; x++) {
			
			System.out.println(" Runnable => "+x);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			
		}
		
	}

}
