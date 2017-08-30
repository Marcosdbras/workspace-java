import java.util.HashSet;
import java.util.Set;

public class Aplicacao {

	public static void main(String[] args) {
		
		/*Conjunto não permitem elemento duplicado*/
		Produto p1 = new Produto(1,"Martelo");
		Produto p2 = new Produto(1,"Martelo");
		
		
		/*referencia ao mesmo objetos são iguais para o java*/
		Produto p3 = p2;
		
		Set<Produto> produto = new HashSet<Produto>();
		
		produto.add(p1);
		produto.add(p2);
		produto.add(p3);
		
		for (Produto produtos : produto) {
			System.out.println("=> "+produtos);
		}
		
		
	}

}
