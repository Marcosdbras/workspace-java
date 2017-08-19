
public class Aplicacao {

	/*Também posso definir a constante da enum dentro da classe normal do java*/
	private enum Genero{
		MASCULINO,
		FEMININO
	}
	
	
	public static void main(String[] args) {
		/*Uso de Enum definido como outra classe*/	
		
		DiaDaSemana hoje;
		
		hoje = DiaDaSemana.SEXTA;
		
		
		int num = DiaDaSemana.QUARTA.getnum();

		
		System.out.println(num);
		
		
		/*Atenção a string tem que conter exatamente o valor que está declarada na classe enum, caso contrário ocorrerá uma exceção*/
		String s = "TERÇA";
		
		DiaDaSemana d = DiaDaSemana.valueOf(s);
		
		System.out.println(d.getnum());
		
		
		/*Uso do Enum que foi defnido dentro da própria classe*/
		Genero M = Genero.MASCULINO;
		
		
		/*Aplicacao demostra que posso resgatar o valor de outra classe se quiser*/
		Genero F = Aplicacao.Genero.FEMININO;
		
		
		
	}

}
