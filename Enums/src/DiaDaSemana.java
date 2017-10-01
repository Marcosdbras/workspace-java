
public enum DiaDaSemana {
 /*Elementos do enums*/
	DOMINGO(1),
	SEGUNDA(2),
	TERÇA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SADADO(7);
	
	private int num;
	
	DiaDaSemana(int num){
		this.num = num;
	}
	
	public int getnum() {
		
        return num;
	}
		
}
