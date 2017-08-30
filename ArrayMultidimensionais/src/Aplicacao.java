
public class Aplicacao {

	public static void main(String[] args) {
		int [] array = new int[5];
		
		/*Array de 2 dimenões se assemelha a uma tabela, ou seja,
		 * pense visualmente que vc tenha linhas e colunas*/
		
		int[][] arrayMult = new int[3][5];
		
		arrayMult[2][3] = 10;
		
		
		/*Interação nas linhas da array*/
		for (int i = 0; i < arrayMult.length; i++) {
            /*Interação nas colunas da array*/ 
			for (int j = 0; j < arrayMult[0].length; j++) {
				
				System.out.print(arrayMult[i][j]+" ");
				
			}
			
			System.out.println();
			
		}
		
		
		/*Exercício: criar e interar sobre uma array de 3 dimensões*/

	}

}
