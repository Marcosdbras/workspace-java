
public class Produto {
	private int id;
	private String descricao;
	
	
	
	
	public Produto(int id, String descricao) {
		
		this.id = id;
		this.descricao = descricao;
		
	}




	public int getId() {
		return id;
	}




	public String getDescricao() {
		return descricao;
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
		return id+", "+descricao;
	}




	
	
}
