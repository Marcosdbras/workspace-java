
@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception{
  double valor;
  double saldo;

public SaldoInsuficienteException(double valor, double saldo) {
	
	this.valor = valor;
	this.saldo = saldo;
}

public double getSaldo() {
	return saldo;
}

public double getValor() {
	return valor;
}



 


  
}
