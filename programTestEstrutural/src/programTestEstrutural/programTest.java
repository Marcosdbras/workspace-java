package programTestEstrutural;

public class programTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		
		// while (true)
		
		//Teste é sempre relizado no inicio
		while (x<=10) {
			
			System.out.println(x);
			x++;
			
			//break: força saida do loop
			//continue: força fazer o teste 
			
		}
		
		
		x=0;
		//Teste é sempre realizado no final
		do {
			
			System.out.println(x);
			x++;
			
			//break: força saida do loop
			//continue: força fazer o teste 
			
		}while (x<=10);
		 	
			
		//for...next
		for ( int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		int j=0;
		int y=0;
		for (j=0,y=12; j<12; y--, j++) {
			System.out.println(j+" - "+y);
			
		}
		
		char cDados = 'A';
		
		
		if (cDados == 'B') {
		
			for (;;){
				
				System.out.println("Loop indefinido");
			}
			
			
			
		}
		
		
		
		

	}

}
