import java.util.Random;

public class Aplicacao {

	public static void main(String[] args) {
	  
	/*Primeira opção para gerar números aleatórios*/	
	for (int i = 0; i < 10; i++) {
		  
		  double d = Math.random();
		  
		  System.out.println((i + 1) + " => " +d);
		  
		  
		  
	  }	
	  
	  /*Segunda opção para gerar números aleatórios
	   * 
	   * ou utilizar 
	   * 
	   * Random r = Random(123)
	   * Neste caso os número gerados serão sempre os mesmos
	   * 
	   * */
	  Random r = new Random();
	  
	  for (int i = 0;i < 10;i++) {
		  
		  
		  int dd = r.nextInt();
		  
		  System.out.println((i + 1)+" => "+dd);
		  
	  }
	  
	  
	  /*Terceira Opção para gerar números randomicos
	   *Neste caso gera número de 0 a 99 
	   * */
	  for (int i = 0;i < 10;i++) {
		  
		  int ddd = r.nextInt(100);
		  
		  System.out.println((i + 1)+" => "+ddd);
		  
	  }
	  
	  
	  /*Gerar número randomico a partir de um intervalo pré-definido*/
	  
	  for (int i = 0; i > 10; i++) {
		  
		 int di = gerarInt(50, 100);
		  
		  
		  System.out.println((i + 1)+" => "+di);
		  
	  }
	  

	}
	
	/*Gerar números a partir de intervalos mínimos e máximos*/
	static int gerarInt(int inicio, int fim) {
	  
		int intervalo = fim - inicio;
		
		int n = (int)(Math.random() * intervalo)+inicio;
		
		
	  return n;	
	}
}
