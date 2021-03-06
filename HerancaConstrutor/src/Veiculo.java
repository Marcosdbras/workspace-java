
public class Veiculo {	
	
  //Estas vari�veis s� s�o enxergadas pela pr�pria classe	
  private String marca;
  private String modelo;
  private int ano;  
  
  //Estas vari�veis s� s�o enxergadas pela classe e subclasse
  protected String cor;
  protected String conservacao;
  
  public Veiculo() {
	  //Esta chamada � sempre colocada de forma impl�cita, portanto, n�o � necess�rio coloc�-la no c�digo 
	  super();
	  
	  System.out.println("+ Veiculo()");
  }
  
  public Veiculo(String marca, String modelo, int ano) {
	  
	  //Receber par�metro via construtor
	  this.marca = marca;
	  this.modelo = modelo;
	  this.ano = ano;
	  
	  System.out.println("+ Veiculo()");
  }
  
  
  public void buzinar() {
	  System.out.println("    - BI BI");
  }
  
  public void imprimirDados() {
	  System.out.println("    - Marca => "+marca);
	  System.out.println("    - Modelo => "+modelo);
	  System.out.println("    - Ano => "+ano);
  }

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}
}
