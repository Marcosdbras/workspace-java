
public class Banco {
	
	public void realizarOperacao() {
		
		
		ContaBancaria c = new ContaBancaria();
		
		
		
		c.setNumConta(5433);
		c.setAtiva(true);
		
		try {
			c.depositar(5000);
		} catch (Exception e1) {
			System.out.println("Ocorreu um erro: "+e1.getMessage());
		}		
		
		
		try {
			c.sacar(-100);
			System.out.println("Saque realizado com sucesso!");
			
		} catch (SaldoInsuficienteException e) {			
			System.out.println("Saldo Insuficiente de "+e.getSaldo()  );
			
		} catch (ValorNegativoException e) {			
			System.out.println("Você tentou sacar valor negativo de "+e.getValor() );
			
		}finally {
			/*
			 * Tudo que está no finally é executado sempre,
			 *Independente das passagens pelo catch 
			 * 
			 * */
			System.out.println("Seu saldo é "+c.getSaldo()); 	
			
		}
		  
		
				
		
		
		
	}

}
