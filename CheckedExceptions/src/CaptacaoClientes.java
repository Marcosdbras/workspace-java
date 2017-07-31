
public class CaptacaoClientes {
  String nome;
  String cpf;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) throws Exception{
	if (cpf.length() < 11) {
		throw new Exception("Número do cpf com dígitos insuficientes");
	} 
	
	this.cpf = cpf;
}
  

  
  
}
