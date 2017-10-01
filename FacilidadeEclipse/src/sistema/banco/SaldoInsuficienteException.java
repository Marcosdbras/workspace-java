package sistema.banco;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	/*
	 * Classe de exceção
	 * 1) Browse / Exception
	 * 2) constructor class superclass 
	 * 
	 * inverso/source/generate construtor supercall
	 * */
	
	public SaldoInsuficienteException() {
		
	}

	public SaldoInsuficienteException(String message) {
		super(message);
		
	}

	public SaldoInsuficienteException(Throwable cause) {
		super(cause);
		
	}

	public SaldoInsuficienteException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public SaldoInsuficienteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
