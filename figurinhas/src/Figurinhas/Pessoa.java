package Figurinhas;

public class Pessoa {
    
	/*      
	 * Todos os 
	 * O Java não inicializa  automaticamente as variáveis dentro métodos, porém
	 * os atributos dentro dos obejtos das classes são sempre inicializados com algum valor */ 
	
	
	// Atributos 
	String nome;        // Valor padrão: null
	int numFigurinhas;  // Valor padrão: 0
	
	//Métodos
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}
	
	void dar(int numFigurinhas, Pessoa p) {
	  
		//p             = para quem irá dar figurinha
		//numFigurinhas = Quantas figurinhas var dar
		
		this.numFigurinhas -= numFigurinhas;  
	  
	    p.receber(numFigurinhas);  // ou p.numFigurinhas += numFigurinhas;
	    
	    
	  
	}
    
}
