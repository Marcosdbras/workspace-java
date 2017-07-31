
@SuppressWarnings("serial")
public class ClientesLimiteException extends Exception {
  double valor;

public ClientesLimiteException(double valor) {
	
	this.valor = valor;
}
  
  public double getValor() {
	return valor;
  }
}
