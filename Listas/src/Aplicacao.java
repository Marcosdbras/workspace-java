import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		/*Lista tem uma série de vantagens sobre os arrays
		 *ArrayList: significa que os elementos são dispostos em array, enquanto
		 *linkedlist: significa que é criada uma referencia na memória entre um elemento e outro
		 *
		 *Generic permite que informe quais os tipos de dados os elementos serão
		 *
		 *Existe método para buscar elemento, retornar tamanho, entre outros
		 * */
		List<String> l = new ArrayList<String>();
        
		
		/*Adicionando na lista*/
		l.add("abc");
		l.add("def");
		
		/*substituindo elemento numa posição definida*/
		l.set(1, "ghi");
		
		
		/*Inserir elemento numa posição específica*/
		l.add(1,"def");
		
		for(String s:l) {
			System.out.println(s);
		}
		
		
		for (int i=0;i<l.size();i++) {
			
			System.out.println(l.get(i));
			
		}
		
		
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
		String a = l.get(1);
		System.out.println(a);
		
		
		
		
		
	}

}
