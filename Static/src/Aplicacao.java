
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estatico pertence a classe e n�o ao objeto da classe, portanto, n�o precisa instanciar
		double soma = Matematica.somar(2, 5);
		double sub = Matematica.subtrair(5, 3);	
		
		System.out.println(soma);	
		System.out.println(sub);
		
		Matematica m = new Matematica();
		double div = m.divisao(10, 5);
		double mult = m.mult(50, 10);		
		
		
		System.out.println(div);
		System.out.println(mult);
		
		
		// valor contador � static, portanto, valor � compartilhado entre os objetos
		Contador c1 = new Contador();
		c1.incrementar();
		
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		System.out.println("Contador => "+c1.getValor());
		
		c2.incrementar();
		c3.incrementar();
		
		
		System.out.println("Contador => "+c2.getValor());
		System.out.println("Contador => "+c3.getValor());
		
		ContadorStatic.incrementar();
		ContadorStatic.incrementar();
		ContadorStatic.incrementar();
		ContadorStatic.incrementar();
		
		System.out.println("Contador Static => "+ContadorStatic.getValor());  
		  
		double media = Constantes.MEDIA_DA_PROVA;
		
		System.out.println("M�dia Definida=> "+media);
		
		//Heran�a: Utiliza comando extend
		
		
		
	}

}
