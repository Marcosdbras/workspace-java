
public class Produto implements Comparable<Produto>{
	private int id;
	private String descricao;
	private double valor;	
	
	
	public Produto(int id, String descricao, double valor) {
		
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		
	}




	public int getId() {
		return id;
	}




	public String getDescricao() {
		return descricao;
	}
	
	public double getValor() {
		return valor;
	}


    /*
     * Este hasCode foi gerado através do recurso do eclipse
     * clique inverso/source/generator hashCode equals 
     *
     * hashCode Também poderia ser gerado a partir de princípios matemáticos 
     * que forçaria a distribuição igualitária dos objetos no balde
     * 
     * Toda implementação que tiver hash no nome tem que ter a sobreescrita hashCode e equals
     * Deve-se sobreescrever toString para que o objeto mostre a informação correta
     *  
     **/
	  
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public String toString() {
		return id+", "+descricao+", "+valor ;
	}




	@Override
	public int compareTo(Produto o) {
		
		/*retorna 0 - objetos iguais
		 *> O retorna qualquer valor positivo
		 *< O retorna valor negativo, sendo geralmete -1      
		 * 
		 *         Sempre que retornar 0 significa que o produto não vai aparece no conjunto,
         * pois uma das características do conjunto é eliminar elementos repitidos,
         * porém, se retornar qualquer outro número ao invés de zero o produto mesmo que repitido
         * fará parte do conjunto 
		 * 
		 * 
		 * Neste caso quando tiver valor igual não aparecerá no conjunto,
		 * pois conjunto não aceita valores iguais
		 * 
		 * */
		
		
		if (this.valor == o.valor) {
		  return 0;	
		}
		
		if (this.valor > o.valor) {
		  return 1;	
		}
		
		return -1;
		
		
		
	}




	
	
}
