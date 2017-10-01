import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
   
	private static final int MAX = 10;
	
	
	/* Queue: Representa fila de informações  */
	private Queue<Integer> fila = new LinkedList<>();
	
	
	/*Primeiros elementos produzidos serão os primeiros a serem consumidor*/
	
	public synchronized void produzir(int n) {
	  /*Coloca elemento na fila*/
	  while (fila.size() == MAX) {
		 /*Para verificar a condição é importante verificar com while*/ 
		 try {
			/*Sempre interromper utilizadando o monitor,
			 *neste caso está this
			 *a thread dorme e libera o lock
			 *
			 * */ 
			wait();
			
		 	} catch (InterruptedException e) {
			
		 			e.printStackTrace();
		 	} 
		  
		  
	  }
		
		
	  fila.offer(n);
	  
	  
	  /*Acorda todas as thread que dormem*/
	  notifyAll();
	  
	  imprimir();
	
	}
	
	
	public  int consumir(){
		
		/*Retira elemento da fila*/
				
		/*Forma diferente de usar synchronized
		 *para que o método não seja usado por duas
		 *ou mais thread ao mesmo tempo 
		 * */
		synchronized (this) {
			while (fila.size() == 0) {
			   
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			
			int n = fila.poll();
			
			notifyAll();
			
			imprimir();
			return n;	
			
		}
		
		
	}
	
	private void imprimir() {
		System.out.print("=> ");
		
		for (Integer n: fila) {
			System.out.print(n +" ");
		}
		
		System.out.println();
	}
	
}
