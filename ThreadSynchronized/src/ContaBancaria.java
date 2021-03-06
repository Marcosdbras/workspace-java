
public class ContaBancaria {

	/*
	 * Para ter um saldo sólido no final da execução
	 * das diversas threads também posso utilizar o conceito de
	 * monitor com synchronized
	 * 
	 * Também posso utilizar o lock do próprio objeto
	 * ContaBancaria como monitor através do this.
	 * 
	 * ex.:
	 * 
	 * synchronized (this){
	 *    
	 *     saldo += valor
	 *    
	 * }
	 * 
	 * 
	 * */
	
	/*Não esquecer de criar o objeto abaixo como final*/
	private final Object monitor = new Object();
	
	private double saldo = 1000;
	
	public void sacar(double valor) {
	    /*O que estiver dentro de synchronized está protegido da manipulação de outra thread*/ 
		synchronized (monitor) {
			saldo -= valor; 
	       	 
	     }
		
	} 
	
	public void depositar(double valor) {
	    synchronized (monitor) {
	    	saldo +=valor;	
	    }
		
		
		
	}
	
	/*
	 * O bloqueio aqui seria interessante se houve a leitura do saldo 
	 * entre a manipulação do depositar e sacar também  
	 * 
	 * */
	public synchronized double getsaldo() {
	   return saldo;
	}
	
	
}
