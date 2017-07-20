
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Passagem de parametro somente por cópia, o método só manipula cópia da informação
		
		
		Operacao o = new Operacao();
		
		// variavel criada da stack
		int x = 10;
		
		o.trocar(x);
		
		System.out.println(x);
		
		//Aqui faz a copia da referencia para o objeto
		Valor valor = new Valor();
		
		valor.v  = 10;		
		o.alterarValor(valor);		
		System.out.println(valor.v);
				
		
		
		// Aponta para objeto diferentes
		valor.v = 10;
		o.modificaValor(valor);
		
		System.out.println(valor.v);
		
		
		
	}

}
