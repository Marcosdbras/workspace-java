package meuPrimeiroProjeto;

public class Aplicacao {

	public static void main(String[] args) {
		
		System.out.println("Meu primeiro código java no linux!");
		
		//Declarando Variáveis
		int numero;
		
		
		//Definindo variável
		numero = 50;
		
		//Mostrando númenro
		System.out.println(numero);
		
		//Declarando e atribuindo ao mesmo tempo
		int mesa = 10;
		System.out.println(mesa);
				
		int totalMesa = 4 * mesa;
		System.out.println(totalMesa);
		
		totalMesa = totalMesa - 1;
		System.out.println(totalMesa);
		
		
		/*  Cuidado com esta estrutura
		 *  Primeiro coloca-se o operador matemático 
		 *  Em seguida coloca-se o atribuidor igual
		 *  Exemplo:  i-=1;
		 */
		totalMesa -=1;
		System.out.println(totalMesa);
		
		totalMesa *= 2;
		System.out.println(totalMesa);		
		
		
		totalMesa--;
		System.out.println(totalMesa);		
		
		int a = 10 + 5;
		
		//erro: int i = 10L + 5;
		
		//erro: int d = 5 * 2.0;
		
		float f = 10.0f * 5l;
		System.out.println(f);
		
		double d = 0.0/0; //retorna NaN: número pertencente aos números imaginários
		System.out.println(d);
		
		// retorna uma exceção: float folha = 0/0;
		
		// retorna uma exceção: float folha =  1/0;
		
		float folha = 0/1;
		System.out.println(folha);
		
		double x = 10.0/0; //retorna infinity, utilizando mesma regra da matemática
		System.out.println(x);
		
		//Cuidado ao trabalhar com divisão por 0 no java

	}

}
