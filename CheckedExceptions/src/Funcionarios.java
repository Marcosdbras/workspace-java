
public class Funcionarios {
 
  String nome;
  double salario;
  
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) throws Exception{
	if (salario < 0) {
	  throw new Exception("Salário menor que zero");	
		
	}
	
	this.salario = salario;
}
  
  
}
