
public class Clientes {

	
	public void salvar() throws GenericoException {
		
		ClientesCRUD c = new ClientesCRUD("","Marcos Brás", 1000);
		try {
			
			c.salvar();
			
		} catch (ClientesCPFException e) {
			
			throw new GenericoException("Erro de CPF ", e);
			
		} catch (ClientesLimiteException e) {
			
			throw new GenericoException("Erro de limite",e);
			
		}		
		
		
	}
	
	
	
}
