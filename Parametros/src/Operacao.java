
public class Operacao {
   void trocar(int n) {
	   
	   //est� trocando s� o valor de n e n�o o valor de x da classe. n n�o � visivel fora do metodo
	   n = 20;
   }
   
   void alterarValor(Valor valor) {
	   
	   valor.v = 20;
	   
   }
   
   void modificaValor(Valor valor) {
	   //Cria novo ponteiro
	   valor = new Valor();
	   valor.v = 20;
	   
   }
}
