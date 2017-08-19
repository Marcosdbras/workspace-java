package br.util;
/**
 * Biblioteca de classes
 * 
 * 
 * @author marcosbras
 *
 *
 *Para gerar JAR no eclipe vc deve dar um clique inverso
 *no projeto /  clicar em export / clicar em JAR
 *
 *Escolha o local que deverá ser gerado o JAR
 *
 *Nesta opção também é possível gerar um arquivo manifesto
 *
 
 * Lembrando que arquivo com extensão JAR são arquivos no formato ZIP
 * em podem ser abertos por qualquer programa compressor e descompressor
 * 
 */
public class StringUtils {
  
	/**
	 * isEmpty: Método que retorna se string está em brando ou não
	 * 
	 * @param s : String para se analisada
	 * @return : Retorno da analise
	 * 
	 */
	
	public static boolean isEmpty(String s) {
		
		if (s == null) {
			
			return true;
		}
		
	    return s.trim().length() == 0;	
		
	}
	
}
