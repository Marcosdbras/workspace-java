package Figurinhas;

public class Pessoa {
    
	/*      
	 * Todos os 
	 * O Java n�o inicializa  automaticamente as vari�veis dentro m�todos, por�m
	 * os atributos dentro dos obejtos das classes s�o sempre inicializados com algum valor */ 
	
	
	// Atributos 
	String nome;        // Valor padr�o: null
	int numFigurinhas;  // Valor padr�o: 0
	
	//M�todos
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}
	
	void dar(int numFigurinhas, Pessoa p) {
	  
		//p             = para quem ir� dar figurinha
		//numFigurinhas = Quantas figurinhas var dar
		
		this.numFigurinhas -= numFigurinhas;  
	  
	    p.receber(numFigurinhas);  // ou p.numFigurinhas += numFigurinhas;
	    
	    
	  
	}
    
}
