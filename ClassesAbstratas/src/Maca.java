
public class Maca extends Item {
    
	/*
	 * Se estiver extendendo de uma classe abstrata, como é o caso da classe Item, 
	 * obrigatóriamente, tenho que implementar todos os métodos abstratos da classe abstrada "Item"
	 * Não é sobreescrita de método, e sim fornecer implementação do método
	 * 
	 * clica no erro depois CTRL+1 para utilizar sugestão de correção do eclipse
	 * */	
	@Override
	public void pegar() {
		// TODO Auto-generated method stub
        System.out.println("Pegando a maçã");
	}

}
