import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		
		int j = 0;
		
		
		int [][] elementos = new int[4][4];
		
		Scanner s = new Scanner(new File("dados.txt"));
		
		while (s.hasNextLine()) {
			
			String line = s.nextLine();
			
			String[] tokens = line.split("\t");
			
			//Tirando Aspas
			for (int i = 0; i < tokens.length; i++) {
			    
				tokens[i] = tokens[i].replace("'", "");
			    
				elementos[j][i] = Integer.parseInt(tokens[i]);
		
			} 
			
			j++;
			
			
			
			
		}
		
		
		for (int a = 0;a < elementos.length;a++) {
			
			for (int b = 0;b < elementos[a].length;b++ ) {
				
				System.out.print(elementos[a][b]+"\t");
				
				
			}
			
			System.out.println();
			
		}
		

	}

}
