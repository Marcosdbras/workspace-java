import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {
		/*Podemos colocar elementos, porém, não permite elemento duplicados
		 * No set o elementos não tem indice
		 * Somente Array e List tem indice
		 * */
		Set<String> set = new HashSet<>();
		
		set.add("A7");
		set.add("B6");
		set.add("C5");
		set.add("D4");
		set.add("E3");
		set.add("F1");
		set.add("G2");
		set.add("H8");
		set.add("H8");
		set.add("H8");
		
		for(String s : set) {
			System.out.println(s);
			
		}
		
		System.out.println();
		
		
		/*LinkedHashSet obdece a ordem de inclusão dos elementos*/
		Set<String> linked = new LinkedHashSet<>();
		
		linked.add("A3");
		linked.add("B1");
		linked.add("C2");
		linked.add("D1");
		linked.add("E2");
		linked.add("F4");
		linked.add("G8");
		
		
		for (String s:linked) {
			System.out.println(s);
		}
		
		System.out.println();
		
		/*Permite que construa elementos ordenados
		 * Garante ordem de inserção
		 * */
		Set<String> treeset = new TreeSet<>();
		
		treeset.add("B1");
		treeset.add("A3");
		treeset.add("C5");
		treeset.add("D9");
		treeset.add("Z8");
		treeset.add("E5");
		treeset.add("H2");
		
		for (String s:treeset) {
			System.out.println(s);
		}
		System.out.println();
		
	}

}
