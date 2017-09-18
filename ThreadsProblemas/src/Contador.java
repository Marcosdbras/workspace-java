
public class Contador {

	private int valor;
	
	public synchronized  void incrementar() {
		/*A palavra chave synchronized protege a variável valor
		 *para que outra na faça a manipulação dela enquanto o processo
		 *não terminar na thread atual
		 *
		 * portanto a race conditions foi corrigida aqui
		 * */
		
		valor ++;
	}
	
	public int getValor() {
		return valor;
	}
	
}
