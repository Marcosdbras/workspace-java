import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream filein = new FileInputStream("Entrada.txt");
		FileOutputStream fileout = new FileOutputStream("Saida.txt");
				
		
		transfer(filein, fileout);
		
		/*Fazer procedimento para fechar o arquivo*/
		
		
		
		/*Para enviar o conteúdo do arquivo para o console
		 * 
		 * OutputStream cout = System.out;
		 * 
		 * transfer(filein,cout);
		 * 
		 * */
		
		
		
		/* Para enviar o conteúdo do console para o arquivo
		 * 
		 * InputStream cin = System.in;
		 * 
		 * transfer(cin, fileout)
		 * 
		 * */
		
		/*
		 * Não funcionou, verificar causa mais tarde.
		 * Lançar de arquivo para String*/
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		transfer(filein, bout);
		byte[] bytes = bout.toByteArray();
		String s = new String(bytes);
		System.out.println(s);
		
		
	}
	
	
	public static void transfer(InputStream in, OutputStream out) throws IOException{
		
		byte[] buffer = new byte[1024];
		
		int bytesLidos;
		
		while ((bytesLidos = in.read(buffer)) > -1) {
			
			out.write(buffer,0,bytesLidos);
			
		}
		
		
		
	}

}
