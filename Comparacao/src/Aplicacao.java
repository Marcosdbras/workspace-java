import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {
		Produto p1 = new Produto(4,"Arroz",3.9);
		Produto p2 = new Produto(3,"Feijão",4.5);
		Produto p3 = new Produto(5,"Macarrão",2.9);
		Produto p4 = new Produto(1,"Lentilha",6.5);
		Produto p5 = new Produto(2,"Lasanha",8.0);
		
		/*
		 * Conjuntos não permite elementos repitidos
		 * portanto esta implementação não permite inserir preço iguais
		 * 
		 *  TreeSet não utiliza método hashCode e equals pra comparar e sim compareTo
		 * 
		 * TreeSet premite criar um conjunto ordenado de elementos
		 * Sempre que utilizar TreeSet deve-se herdar "implements" Comparable 
		 * e implementar o método comparable de acordo com a classificação
		 * que se deseja
		 * */
		Set<Produto> produtos = new TreeSet<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		for(Produto produto:produtos) {
			System.out.println(produto);
		}
		
		System.out.println();
		
		/*Realizando comparação de fora da classe produto*/
		Set<Produto> produtos2 = new TreeSet<Produto>(new DescricaoComparator());
		
		
		produtos2.add(p1);
		produtos2.add(p2);
		produtos2.add(p3);
		produtos2.add(p4);
		produtos2.add(p5);
		
		for(Produto produto:produtos2) {
			System.out.println(produto);
		}
		
		/*LIsta sempre mantem a ordem de inserção
		 * porém, para alterar a ordem é só seguir implementação 
		 * abaixo
		 * 
		 * Neste caso se houver valores duplicados serão mostrados na lista, pois,
		 * uma lista, diferente de conjunto, permite valores duplicados
		 * */
		
		System.out.println();
		
		List<Produto> produtos3 = new ArrayList<Produto>();
		
		produtos3.add(p1);
		produtos3.add(p2);
		produtos3.add(p3);
		produtos3.add(p4);
		produtos3.add(p5);
		
		/*Este comando coloca na ordem que foi definido pelo método subreescrito campareTo 
		 * dentro da própria classe Produto*/
		Collections.sort(produtos3);
		
		for (Produto produto:produtos3) {
			System.out.println(produto);
		} 
		
		
		System.out.println();
		
		List<Produto> produtos4 = new ArrayList<Produto>();
		produtos4.add(p1);
		produtos4.add(p2);
		produtos4.add(p3);
		produtos4.add(p4);
		produtos4.add(p5);
		
		/*Nest outro caso irá ordenar utilizando os principios 
		 * de comparação da classe DescricaoComparator*/
		Collections.sort(produtos4, new DescricaoComparator());
		
		
		for (Produto produto:produtos4) {
			System.out.println(produto);
		}
		

	}

}
