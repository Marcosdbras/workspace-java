package Figurinhas;

public class Aplicacao {
  
	//digita main + CTRL + Space e o eclipse autocompleto. 
	public static void main(String[] args) {
		
	
		Pessoa p1 = new Pessoa();		
		p1.nome = "Jos�";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		
		
		p1.receber(5);
		p1.receber(7);
		
		
		p1.dar(2, p2); // 
		
		
		System.out.println(p1.nome+" => "+p1.numFigurinhas);
		System.out.println(p2.nome+" => "+p2.numFigurinhas);
		
	
	}
}