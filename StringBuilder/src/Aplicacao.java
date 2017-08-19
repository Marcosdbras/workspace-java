
public class Aplicacao {

	public static void main(String[] args) {
		
		/*
		 * IMPLEMENTAÇÃO ABAIXO É INCORRETA
		 * PARA CONCATENAR STRING DENTRO DE INTERAÇÃO
		 * FOR
		 * 
		 * Nesta caso a cada interação está
		 * sendo gerada uma nova string
		 * 
		 * desta forma causa problema de desempenho na aplicação
		 * pode ocorrer prblema de memória
		 * 
		 * 
		 * */
		String s = "";
		
		for (int i = 0;i < 1000; i++) {
			s = s + "X";
		}
		
		System.out.println(s);

		
		/*
		 * A IMPLEMENTAÇÃO ABAIXO É A FORMA CORRETA
		 * PARA CONCATENAÇÃO DE STRING DENTRO DE INTERAÇÃO
		 * 
		 * Desta forma temos o jeito correto abaixo
		 *para concatenar string dentro de um loop */
		
		StringBuilder sb = new StringBuilder();
		
		for (int z = 0; z < 1000;z++) {
			sb.append("X");
			
		}
		
        String s1 = sb.toString();		
		
		System.out.println(s1);
		
		
	}

}
