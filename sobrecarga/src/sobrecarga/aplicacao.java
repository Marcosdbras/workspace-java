package sobrecarga;

public class aplicacao {
  public static void main(String[] args) {
	
	  Matematica m = new Matematica();
	 
	  int soma = m.somar(2, 4);
	  
	  System.out.println(soma);
	  
	  soma = m.somar(2, 5, 7);
	 
	  System.out.println(soma);
	  
	  double dSoma = m.somar(2.4, 3.7);
	  
	  System.out.println(dSoma);
  }
}
