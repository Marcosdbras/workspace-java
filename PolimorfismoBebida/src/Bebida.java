
public class Bebida {
	
  private String nome;
  private boolean aquecer;
  
  
public Bebida(String nome, boolean aquecer) {
	/* 
	 * Digite os atributos da classe
	 * 
	 * clique em verso e vai at� 
	 * Source/construtor using field
	 * para criar este construtor
	 * 
	 * para gerar v�rios getter e setter de uma vez 
	 * vc pode clicar em verso e vai at�
	 * Source/Generate Getters e Setter
	 * expande ou recolhe as op��es
	 * ou para inserir um por um 
	 * digite get e pressiona ctrl+space
	 * 
	 * */
	

	this.nome = nome;
	this.aquecer = aquecer;
	
}
  

public String getNome() {
	return nome;
}

public boolean isAquecer() {
	return aquecer;
}
  
public void preparar() {
	
}
  
}
