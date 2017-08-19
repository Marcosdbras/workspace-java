package br.java.app;

/*Importando todas as classes*/
import br.java.app.nivel2.*;

/*Importando uma única classe*/
import br.java.app.nivel2.B;

public class Aplicacao {

	public static void main(String[] args) {
		
		/*Full Qualifid Name
		 *è necessário FQN quando tiver duas classes com mesmo nome em pacotes diferentes
		 * 
		 * */
		br.java.app.nivel1.A obj1 = new br.java.app.nivel1.A();
		
		/* Para realizar imports de forma automática
		 * 
		 * 
		 * 
		 * clique inverso / source / organize imports
		 * 
		 * CTRL + SHIFT + o 
		 * 
		 * 
		 * 
		 * */
		
		/*Neste caso a classe B foi localizada através do import no inicio do código*/
		B b = new B();

	}

}
