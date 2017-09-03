
public class ClientesCRUD {
  
  private String cpf;
  private String nome;
  private double valorLimite;
  
public ClientesCRUD(String cpf, String nome, double valorLimite) {

	this.cpf = cpf;
	this.nome = nome;
	this.valorLimite = valorLimite;
}

public String getCpf() {
	return cpf;
}

public String getNome() {
	return nome;
}

public double getValorLimite() {
	return valorLimite;
}

public void salvar() throws ClientesCPFException, ClientesLimiteException{	
	
	if (cpf.isEmpty()) {
	   throw new ClientesCPFException(cpf, nome);	
	}
	
	System.out.println("Gravando no banco de dados");
	System.out.println("Nome: "+nome);
	System.out.println("CPF: "+cpf);
	System.out.println("Limite: "+valorLimite);
	System.out.println("Operação realizada com sucesso!");
}
  




}
