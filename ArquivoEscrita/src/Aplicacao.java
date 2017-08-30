import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Aplicacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
	
		
		try (OutputStream os = new FileOutputStream("Saida.txt")){
			
			/*Texto para ser gravado*/
			String s = "Texto para ser gravado";
			
			/*Adquire array de bytes*/
			byte[] buffer = s.getBytes();
			
			/*Escreve no arquivo*/
			os.write(buffer);
			
		}

		 
		try(   BufferedWriter writer = new BufferedWriter(   new FileWriter("Saida.txt")  )  ){
			
			String s = "Outro texto para ser gravado...";
			
			writer.write(s);
			
		}
		
		
		try(PrintWriter pw = new PrintWriter("Saida.txt")){
		   
			String s = "Agora arquivo gravado com PrinterWriter";
			
			pw.println(s);
			
		}
		
		
		
	}

}
