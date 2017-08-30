import java.util.HashSet;
import java.util.Set;

public class Aplicacao {

	public static void main(String[] args) {
		
		/*Conjunto não permitem elemento duplicado*/
		Produto p1 = new Produto(1,"Martelo");
		Produto p2 = new Produto(1,"Martelo");
		
		
		/*referencia ao mesmo objetos são iguais para o java*/
		Produto p3 = p2;
		
		
		Produto p4 = new Produto(2,"Serrote");
		Produto p5 = new Produto(3,"Prego");
		Produto p6 = new Produto(4,"Chave de fenda");
		Produto p7 = new Produto(5,"Chave philips");
		
		Set<Produto> produto = new HashSet<Produto>();
		
		produto.add(p1);
		produto.add(p2);
		produto.add(p3);
		produto.add(p4);
		produto.add(p5);
		produto.add(p6);
		produto.add(p7);
		
		for (Produto produtos : produto) {
			System.out.println("=> "+produtos);
		}
		
		
		System.out.println("p1 =>"+produto.contains(p1));
		System.out.println("p2 =>"+produto.contains(p2));
		System.out.println("p3 =>"+produto.contains(p3));
		System.out.println("p4 =>"+produto.contains(p4));
		System.out.println("p5 =>"+produto.contains(p5));
		System.out.println("p6 =>"+produto.contains(p6));
		System.out.println("p7 =>"+produto.contains(p7));
		
		
		
	}

}
