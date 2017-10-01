package sistema.banco;

public class ContaCorrente extends Conta {

	/*
	 *  1) Inherited abstract methods: Herda métodos abstratos da super classe
	 *  
	 *  ou
	 *  
	 *  inverso/source/overide implemets metodos
	 *  
	 * 	bolinha amarela : protected
	 * 	bolina verde : public
	 * 	losango amarelo A =  Abstract
	 * 
	 * 
	 * */
	
	
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		
		if (valor <= 0) {
			
			throw new IllegalArgumentException();
			
		}
		
		
		if (getSaldo() - valor < 0) {
		  throw new SaldoInsuficienteException("Saldo Insuficiente");	
		}
		
		setSaldo(getSaldo() -  valor );
		
		
	}

	@Override
	public void depositar(double valor) {
		
		//TODO Checar se o valor não é negativo ou zero
		
		if (valor <= 0 ) {
			
			throw new IllegalArgumentException();
		}
		
		setSaldo(getSaldo() + valor);
		
	}
	

}
