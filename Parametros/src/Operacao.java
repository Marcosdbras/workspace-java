
public class Operacao {
   void trocar(int n) {
	   
	   //está trocando só o valor de n e não o valor de x da classe. n não é visivel fora do metodo
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
