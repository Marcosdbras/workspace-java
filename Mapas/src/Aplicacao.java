import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aplicacao {

	public static void main(String[] args) {
		/*Mapas ou Dicionário
		 *Associação de chave e valor atrelado
		 * 
		 * o Generic não trabalha com tipos primitivos, só trabalha com classes ou interface
		 * no caso estamos usando Wrapper Integer
		 * 
		 * Para instanciar o map utilizamos a classe HashMap
		 * 
		 * HashMap não garante que vc terá a mesma ordem de inserção quando houver a iteração
		 * 
		 * já o LinkedHashMap eu tenho a ordem de inserção garantida na hora da iteração
		 * */
										 /*no lugar de HashMap ou posso usar 
										  * LinkedHashMap pra garantir exatamente a ordem de inserção
										  * TreeMap Para garantir a ordem da chave crescente 
										  * */			
		Map< Integer, Produto> map = new HashMap<>();
		
		
		Produto p1 = new Produto(1,"Areia");
		Produto p2 = new Produto(2,"Cimento");
		Produto p3 = new Produto(3,"A Cal"); 
		
		
		map.put(1, p1);
		map.put(2, p2);
		map.put(3, p3);
		
		Produto p = map.get(2);
		System.out.println(p);
		
		/*Iterar sobre as chaves*/
		
		Set<Integer> keys = map.keySet();
		for (Integer key:keys) {
			System.out.println(key);
		}
		
		
		/*Iterar sobre produto*/
		Collection<Produto> values = map.values();
		for (Produto produto : values) {
			System.out.println(produto);
		}
		
		/*Iterar escolhendo exatamente quais informações mostrar*/
		Set<Map.Entry<Integer, Produto>> entries = map.entrySet();
		for (Map.Entry<Integer, Produto> entry:entries ) {
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
	}

}
