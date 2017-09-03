
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*
	 * Com GenericoException não consegue mostrar a mensagem original
	 * da exceção, porém consegue lançar exceção somente num catch
	 * 
	 * */	
	 Clientes c = new Clientes();
	 try {
		c.salvar();
	} catch (GenericoException e) {
		// TODO Auto-generated catch block
		System.out.println("Erro: "+e.getMessage());
	}
	}

}
