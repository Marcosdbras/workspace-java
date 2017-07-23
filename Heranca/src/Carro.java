/*
 * this() - referencia aos metodos da propria classe
 * super  - referencia a classe pai
 * */
public class Carro extends Veiculo{
   private  boolean  quatroPortas;

public  boolean isQuatroPortas() {
	return quatroPortas;
}

public  void setQuatroPortas(boolean quatroPortas) {
	this.quatroPortas = quatroPortas;
}
   
   
public void imprimirDados() {
	//super  - referencia a classe pai 
	super.imprimirDados();
	System.out.println("Quatro portas => "+quatroPortas);
}   
   
   
}
