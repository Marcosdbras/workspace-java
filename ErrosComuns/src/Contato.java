/*
 * Esta é a super classe
 * Não pode ser instanciada
 * por isto está como abstract
 * 
 * */
public abstract class Contato {
  
  private String nome;
  
     /*
	     
	 *  Opção 2 para que não ocorra NullPointerException	 *  
	 *  criar um construtor Contato() e definir     
	 *   
	 *   endereco = new Endereco()
	 * 
	 *   
	 * Opção 3 para que não ocorra NullPointerException
	 *  posso substituir a linha a baixo por
	 *  
	 *  private Endereco endereco = new Endereco()  
	 *   
	 * */
  
  
  private Endereco endereco;
  
  
  
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Endereco getEndereco() {
	
	
	return endereco;
}
public void setEndereco(Endereco endereco) {
	
	/*
	 * esta opção se chama laser loading
	 * 
	 * Opção 4 para que não ocorra NullPointerException
	 * 
	 * if (endereco == null){ endereco = new Endereco()  }
	 * 
	 * 
	 * 
	 * */
	
	
	this.endereco = endereco;
}
  
  
  
}
