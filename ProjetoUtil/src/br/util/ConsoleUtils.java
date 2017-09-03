package br.util;

import java.util.Scanner;

public class ConsoleUtils {
    /**
     * readInt lê um número inteiro do console
     * @return
     */
	public static int readInt() {
		
		
		/*Aguarda usuário entrar com valor*/ 
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		/*Lê o que foi digitado e guarda em str*/
		String str = scanner.nextLine();		
		
		/*Retorna valor digitado*/		
		int i = 0;
		
		try {
		
		  i = Integer.parseInt(str);
			
			
		}
		catch (Exception e) {
			
		
			System.out.println("O valor digitado não é um número inteiro válido, tente novamente!");
			
		}	
		
		return i;
		
	}
	
	
}
