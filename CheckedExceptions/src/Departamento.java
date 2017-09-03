
public class Departamento {
  
	
	
	public void funcDep() throws Exception {
		Funcionarios f = new Funcionarios();
		f.setNome("Rosi");
		
		/*
		 * Caso tenha exceção será lançado para fora
		 * Se o salário for valor negativo ele irá lançar
		 * exceção pra fora
		 * 
		 * */
		f.setSalario(1000.0);
	}
	
   
  
  
}
