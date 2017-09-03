
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




	@Override
	public String toString() {
		/*Esta sobrecarga toString é para se ter uma apresentação amigável do produto*/
		return id +", "+descricao;
	}
}
