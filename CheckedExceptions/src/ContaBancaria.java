
public class ContaBancaria {
	private int numConta;
	private boolean ativa;
	private double saldo;
	
	
	
	//Ler valores de atributos: get
	//Define valores dos atributos: set
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		if (numConta > 0) {
		
			this.numConta = numConta;
		  	
		}
		
	}
	
	public boolean isAtiva() {
		return ativa;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	/*
	 * Colocar na assinatura do método throws Exception
	 * */
	public void depositar(double valor) throws Exception {
		if (valor < 0) {
		   throw new Exception("Valor negativo para depósito");	
		}
		
		saldo +=valor;
	}
	
	
	
	public void sacar(double valor) throws SaldoInsuficienteException, ValorNegativoException{
		/*
		 * Gerenciamento de exceções criada pelo programador
		 * - Valor do saca negativo
		 * - Saldo insuficiente 
		 * 
		 * */
		
		if (valor < 0) {
			
			/*
			 * throw new > Lança excecão
			 * 
			 * */
			throw new ValorNegativoException(valor);
		}
		
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException(valor, saldo);
		}
		
		
		
		saldo -= valor;
	}
	
	
	
	
	
	

}
