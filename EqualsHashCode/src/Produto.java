
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
	
	/*Temos que mostrar ao java que objetos iguais são aqueles que tem mesmo id
	 * para isto temos que sobreescrever o método equals
	 * */
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof Produto)) {
			return false;
		}
		
		Produto other = (Produto) obj;
		if (this.id == other.id) {
			return true;
		}
		
		return false;
		
	}
	
	
	@Override
	public int hashCode() {
		
		/*return 1; ou return id neste tipo de retorno sistema de comparação está lançando tudo dentro de um balde só, desta forma o equals não fica eficiente, o sistema pode ficar lento*/
		
		/*return (int) (Math.random() * 10); desta forma a comparação não fica eficaz pois são criados baldes aleatório*/
		
		/*objetos iguais tem que ir no mesmo balde ou hash*/
		
		
		
		return String.valueOf(id).hashCode();
		
		
	}
	
}
