/*
 * this() - referencia aos metodos da propria classe
 * super  - referencia a classe pai
 * */
public class Carro extends Veiculo{
   private  boolean  quatroPortas;
   
public Carro() {
	System.out.println("  * Carro 5 lugares");
} 

public Carro(String marca, String modelo, int ano) {
	
	/*
	 * Classe carro tem atributo quatroPortas, por�m classe Ve�culo n�o tem, 
	 * portanto, ou o atributo fica null ou carrega atributo via setter, 
	 * pois, o super abaixo corresponde a classe acima
	 * 
	 * N�o existe heran�a de contrutores, por�m, 
	 * somente de m�todos
	 * 
	 * */
	
	super(marca,modelo,ano);	
	
	System.out.println("  * Carro 5 lugares");
	
}


public  boolean isQuatroPortas() {
	return quatroPortas;
}

public  void setQuatroPortas(boolean quatroPortas) {
	this.quatroPortas = quatroPortas;
}
   
   
public void imprimirDados() {
	//super  - referencia a classe pai 
	super.imprimirDados();
	System.out.println("    - Quatro portas => "+quatroPortas);
}   
   
   
}
