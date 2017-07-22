
public class Retangulo {
	  
	  //Atributos: S�o as propriedades da classe
	  private  double largura;
	  private double altura;
	  private double profundidade;
	  
	  //Construtor: Ter� o mesmo nome da classe com diferentes par�metros
	  public Retangulo() {
		  
		  largura = 4;
		  altura = 3;
		  profundidade = 5;
		  
	  }
	  
	  //Aqui houve sobrecarga de m�todo, Construtor A1
	  public Retangulo(double largura, double altura) {
		  
		  this.largura = largura;
		  this.altura = altura;
		  this.profundidade = 1;
		  
	  }
	  
	  //Construtor
	  public Retangulo(double largura, double altura, double profundidade) {
		 
		  this.largura = largura;
		  this.altura = altura;
		  this.profundidade = profundidade; 
		  
	  }
	  
	  public Retangulo(char tipo) {
		  
		  //Chamada do construtor A1, s� consegui chamar um construtor e sempre na primeira linha
		  this(4,5);
		 
		  
		  if (tipo == 1) {
			//chamada do construtor n�o � aceito aqui dentro: this(4,5) 
		  }else {
			  
		  }
		  
		  
	  }
	  
	  
	  //M�todo: S�o as a��es que a classe realiza 
	  public double calculaArea(){
		   
		  return largura * altura * profundidade;
		  
	  }
	  
	  void calculaPerimetro() {
		  
	  }
	  
	  
}
