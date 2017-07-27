
public class Ferrari implements Carro, ItemCaro {

	/*
	 * Palavra chave implements para apontar a interface
	 * Toda vez que utilizar interface eu devo implementar os m�todos
	 * 
	 * Ao contrario de heran�a de classe a nossa classe pode implementar de diversas interface, 
	 * para isso basta separar os nomes da interface com v�rgula
	 * 
	 * */
	
	
	/*
	 *Vem da classe Autom�vel 
	 *
	 * */
	
	@Override
	public void viraEsquerda() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virou a esquerda");
	}

	@Override
	public void viraDireita() {
		// TODO Auto-generated method stub
		
		System.out.println("Ferrari virou a direita");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari acelerou");
	}

	
	/*
	 *Vem da classe Carro 
	 *
	 * */
	@Override
	public void abrirPorta() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari abriu porta");
		
	}
    
	/*
	 *Vem da classe ItemCaro 
	 *
	 * */
	
	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 1000000;
	}
  
}
