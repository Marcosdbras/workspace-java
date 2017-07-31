
public class Aplicacao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Departamento d = new Departamento();
		d.funcDep();
		
		
		
		CaptacaoClientes captacaoclientes = new CaptacaoClientes();
		captacaoclientes.setNome("Marcos Brás");
		
		/*
		 * Caso o tamanho do cpf seja menor que 11 
		 * ele deve lançar a exceção para fora e desta forma
		 * deve finalizar a aplicação
		 * 
		 * */
		captacaoclientes.setCpf("11133344499");
		
		Banco banco = new Banco();
		banco.realizarOperacao();
		
		

	}

}
