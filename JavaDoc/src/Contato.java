
public class Contato {
  
  /**
   * Para iniciar JavaDoc inicie com /** e Enter logo em seguida
   * 
   * Classe que representa contato
   * @version 1.0
   * @author Marcos
   * 
   * 
   */
  
	
  /**
   * Nome do contato	
   */
  private String nome;
  
  /**
   * Email
   */
  private String email;
  
  
  /**
   * Endereço
   */
  private Endereco endereco = new Endereco();

  /**
   * Construtor
   * @param nome 
   * @param email
   */
  public Contato(String nome, String email) {
	
	this.nome = nome;
	this.email = email;
	
  }
  
  
  /**
   * 
   * @param logrador
   * @param numero
   */
  public void Endereco(String logrador, int numero) {

	endereco.setLogrador(logrador);  
	endereco.setNumero(numero);
	  
  }
  
  /**
   * 
   * @return nome
   * 
   */
  public String getNome() {
	return nome;
  }
 
  /**
   * 
   * @return Email
   */
  public String getEmail() {
	return email;
  }  
  
  
}
