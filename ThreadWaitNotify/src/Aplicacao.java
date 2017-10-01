
public class Aplicacao {

	public static void main(String[] args) {
		
		
		/*Verificar código original, pois não funcionou*/
		
		/*Thread: Conceito produtor, consumidor, buffer que por sua vez é compartilhado entre as duas threads*/
		
		Buffer buffer = new Buffer();
		
		/*Iniciando arrays com um produtor e consumidor*/
		Produtor[] produtores = new Produtor[1];
		Consumidor[] consumidores = new Consumidor[1];
		

		
		for (int i = 0; i < produtores.length; i++) {
			produtores[i] = new Produtor(buffer);
			produtores[i].start();
		}

		
		
		for (int i = 0; i < consumidores.length; i++) {
			consumidores[i] = new Consumidor(buffer);
			consumidores[i].start();
		}
		
		
		
		

	}

}
