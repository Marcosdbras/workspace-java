import java.util.Comparator;

public class DescricaoComparator implements Comparator<Produto>{

	/*Neste caso estou comparando 2 objetos estando de fora do mesmo*/
	
	@Override
	public int compare(Produto o1, Produto o2) {
        /*Sempre que retornar 0 significa que o produto não vai aparece no conjunto,
         * pois uma das características do conjunto é eliminar elementos repitidos,
         * porém, se retornar qualquer outro número ao invés de zero o produto mesmo que repitido
         * fará parte do conjunto*/
		if(o1.getDescricao().equals(o2.getDescricao())) {
           return 0;	
        }		
        
        if (o1.getDescricao().compareTo(o2.getDescricao())>0) {
        	return 1;
        }
        
		return -1;
	}

}
