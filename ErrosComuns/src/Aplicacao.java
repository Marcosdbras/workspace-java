
public class Aplicacao {

	public static void main(String[] args) {
		
		/*
		 * NullPointerException é a exceção que acontece muitas vezes 
		 * durante o desenvolvimento de uma aplicação java
		 * 
		 * Isto acontece quando estamos tentando acessar uma área desconhecida
		 * da memória, ou seja região nula
		 * 
		 * Quanto acontecer 
		 * 1) Primeiro analise a linha onde ocorreu o erro
		 * 2) Analise cada ponto de chamada dos métodos
		 * 3) Verifique se não está ocorrendo return de um objeto null  
		 * 
		 * */
		
		
		ContatoPF c1 = new ContatoPF();
		
		
		
		
		c1.setCpf("32165465499");
		c1.setNome("Marcos Daniel Brás");
		
		
		/*
		 * Opção 1 
		 * Neste caso estou apontando um objeto endereco
		 * para que não ocorra new pointer
		 * 
		 * Verifique outras opções para solucionar NullPointerException
		 * na classe contato ou utilize código abaixo 
		 * 
		 * */
		c1.setEndereco(new Endereco());
		
		
		c1.getEndereco().setTipoLogrador("Rua");
		c1.getEndereco().setLogrador("Antonio P. Simões, 611");
		c1.getEndereco().setCidade("São Paulo");
		c1.getEndereco().setEstado("SP");
		
		
		
		
		ContatoPJ cpj1 = new ContatoPJ();
		
		cpj1.setCnpj("00.000.0001-55");
		cpj1.setNome("Bras Soft");
		
		cpj1.setEndereco(new Endereco());
		cpj1.getEndereco().setTipoLogrador("Av.");
		cpj1.getEndereco().setLogrador("Pinhão");
		cpj1.getEndereco().setCidade("Ribeirão das Neves");
		cpj1.getEndereco().setEstado("SP");
		
			
		
		
		
		Agenda a = new Agenda();
		a.setContato1(c1);
		
		
		Agenda b = new Agenda();
		b.setContato1(cpj1);
		
		
		imprimirNomes(a);
		imprimirCnpj(b);
		
		

	}
	
	private static void imprimirNomes(Agenda a) {
		
		/* 
		 * Para não ocorrer NullPointerException 
		 * Neste caso eu verifico se os atributos de Agenda 
		 * que preciso estão todos inicializados na hipp antes
		 * de usa-la
		 * 
		 * */
		if (a.getContato1() != null) {
		  System.out.println(a.getContato1().getNome());
		  
		}
		
		if (a.getContato2() != null) {
			  System.out.println(a.getContato2().getNome());
			  
			}
		
		if (a.getContato3() != null) {
			  System.out.println(a.getContato3().getNome());
			  
			}
		
		
		
	}
	
	
private static void imprimirCnpj(Agenda a) {
	/*
	 * Para que não ocorra o erro ClassCastException durante
	 * um cast forçado de objeto
	 * 
	 * Utilizar instanceof para verificar se o objeto do casting forçado
	 * é do tipo da classe 
	 * 
	 * */
	
	if(a.getContato1() != null && a.getContato1() instanceof ContatoPJ) {
		
		/*Quando ocorre cast  
		 * não utilizar a palavra chave new
		*/
		
		
		ContatoPJ c = (ContatoPJ) a.getContato1();
		System.out.println(c.getCnpj());
		
		
		
	}
	
	
}	
	

}
