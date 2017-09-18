
public class Aplicacao {

	public static void main(String[] args) throws Exception{
		
		/* Criei array de thread
		 * Problema resolvido com a palavra chave synchronized
		 * no ponto crítico do código
		 * 
		 * 
		 * */
		MyThread[] threads = new MyThread[1000];
			
		
		Contador contador = new Contador();
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread(contador);
			
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			
		}

		/* Aguarda todas as threads encerrarem*/
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
			
		}
		
		System.out.println("Valor = "+contador.getValor());
		
		

	}

}
