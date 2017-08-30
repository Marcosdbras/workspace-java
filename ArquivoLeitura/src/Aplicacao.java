import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		
		/*Leitura baixo nível - byte por byte*/
		try(InputStream is = new FileInputStream("Entrada.txt")){
		
			/*1ª forma para ler arquivo byte a byte
			 * 
			 * Esta estrutura try permite o fechamento da 
			 *variável "is" de forma automática
			 *
			 *Nesta Estrutura a variável "is" 
			 *está protegido no próprio arcabouço 
			 *e não aparece para o restante do código
			 *
			 *Neste caso ele está lendo lixo no buffer ou variável b  
			*/
			
			
			/*Cria Array de byte*/
			byte[] buffer = new byte[1024];
		
			/*Faz a leitura*/
			is.read(buffer);
		
			/*Lança pra String*/
			String s = new String(buffer);
		
			/*Exibe String*/
			System.out.println(s);
			
			/*Exibe tamanho da variável "s" */
			System.out.println(s.length());
		
			
		}
		
		System.out.println();
		
		/*Forma clássica de ler um arquivo*/
		InputStream is = null;
		
		try {
			/*
			 * 2ª forma de realizar leitura de arquivo byte por byte 
			*/
			
			is = new FileInputStream("Entrada.txt");
			
			byte[] b = new byte[1024];
			
			int bytesLidos =  is.read(b);
			
			String string = new String(b,0,bytesLidos);
			
			System.out.println(string);
			
			System.out.println(string.length());			
			
			
		} finally {
			if (is != null) {
			  is.close();	
			}
		}
		
		
		System.out.println();
		
		
		/*
		 * A pŕática abaixo será melhor aplicada para leitura de arquivo byte por byte
		 * Estrutura para ler exatamente quantidade de bytes do arquivos
		 * sem faltar e nem sobrar
		 */
		
		try(InputStream entrada = new FileInputStream("Entrada.txt")){
			
			byte[] buffer = new byte[1024];
			
			int bytesLidos;
			
			String s = "";
			
			while( (bytesLidos = entrada.read(buffer)) > -1  ) {
			   	
				s+= new String(buffer,0,bytesLidos);
				
			}
	
			System.out.println(s);
			System.out.println(s.length());
			
		}
		
		System.out.println();
		
		/*Leitura de arquivo lendo linha por linha*/
		
		try(  BufferedReader reader = new BufferedReader(   new FileReader("Entrada.txt")   )  ){
			
			String s = "";
			
			String line;
			
			while(  (line = reader.readLine()) != null  ) {
				
				s+= line + "\n";
				
			} 
			
						
			System.out.println(s);
			System.out.println(s.length());
			
		} 
		
		System.out.println();
		/*Leitura de arquivo lendo linha por linha */
		try(Scanner scanner = new Scanner( new File("Entrada.txt") ) ){
			
			String s = "";
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				s+=line+"\n";
				
			}
			
			System.out.println(s);
			System.out.println(s.length());
			
		}
		
		
		
	}

}
