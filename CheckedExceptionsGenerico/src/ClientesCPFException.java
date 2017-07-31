
@SuppressWarnings("serial")
public class ClientesCPFException extends Exception {
  String cpf;
  String nome;

public ClientesCPFException(String cpf, String nome) {
	
	this.cpf = cpf;
	this.nome = nome;
}
  

public String getCpf() {
	return cpf;
}

public String getNome() {
	return nome;
}



}
