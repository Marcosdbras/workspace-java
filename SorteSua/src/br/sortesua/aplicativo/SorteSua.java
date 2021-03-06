package br.sortesua.aplicativo;
import br.util.ConsoleUtils;
import br.util.RandomUtils;

public class SorteSua {

	public static void main(String[] args) {
		
		
		/*Sorteia o número
		 * 
		 * Pra executar na linha de comando
		 * 
		 * >java -cp aplicatio.jar:[outros.jar] [pacote inicial]
		 * 
		 * Exemplo
		 * 
		 * >java -cp SorteSua.jar:utilitarios.jar br.sortesua.aplicativo.SorteSua
		 * 
		 * Atenção: o que separa um jar do outro é ":" no linux/mac e ";" no windows  
		 * 
		 * para simplificar a execução na linha de código
		 * 
		 * 1) Criar um arquivo texto dentro do projeto denominado
		 * 
		 * MANIFEST.MF
		 * 
		 * 2) Colocar seguinte conteúdo, exemplo:
		 * 
		 * Manifest-Version: 1.0
         * Main-Class: br.sortesua.aplicativo.SorteSua
         * Class-Path: utilitarios.jar
         * 
         * se tiver mais de um jar no Class-Path relacioná-los separando-os
         * com espaço em branco
         * 
         * NÃO FUNCIONOU, verificar pq.
         * 
         * Para definir bat no windows
         * 
         * @"%JAVA_HOME%\bin\java.exe" -jar aplicativo.jar
         * 
         * obs: @ serve para esconder linha de chamada no prompt de comando
		 * 
		 * 
		 * Utilizado Runnable JAR File funcionou, verificar pq.
		 * 
		 * */
		int number = RandomUtils.nextInt(0, 100 );
		
		int guess;
		

		System.out.println("Adivinhe em qual número estou pensando, se vc acertar vc pode ganhar um prêmio");
		
		
		do {
			
			
			System.out.println("Mas, quanto mais tentativas, mais baixo fica o valor à receber.");
			System.out.println("Qual é o número, adivinha???!!! ");
			
			guess = ConsoleUtils.readInt();
			if (guess > number) {
			   System.out.println("O número é menor");	
			} else if (guess < number) {
			   System.out.println("O número é maior");	
			}
			
			
		}while (guess != number);
		
		System.out.println("Você acertou! O Valor que vc ganhou nesta tentativa é R$ "+number / 100);

	}

}
