package sistema.banco;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
	/*
	 * Identar automaticamente 
	 * ctrl+shift+"F"
	 * 
	 * Organize import
	 * ctrl+shift+"o"
	 * 
	 * Comentar diversas linhas
	 * 1) Selecionar
	 * 2) ctrl+"/"
	 * 
	 * Tarefas pendentes
	 * windows/showview/task
	 * 
	 * 
	 * seleciona metodo
	 * inverso/reference/
	 * 
	 * selecione metodo que será renomeado
	 * inverso/refactor/rename
	 * 
	 * selecione bloco
	 * inverso/refactor/extract method
	 * para transforma bloco selecionado em método
	 * 
	 * estudar Refactor pois exixtem várias opções
	 * 
	 * DEBUG
	 * 1) - Dê 2 cliques na linha na linha de parada
	 * 2) Clique no botão debug
	 * 3) <F6> Vai para o próximo passo sem entrar nos métodos
	 * 4) <F5> Vai para o próximo passo entrando nos métodos
	 * 5) <F8> Vai até o final da execução ou até o próximo breaking point
	 * 
	 */
	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(1000);

		try {
			c1.sacar(200);
		} catch (SaldoInsuficienteException e) {

			e.printStackTrace();
		}

		
		
		
		List<ContaCorrente> lista = new ArrayList<>();
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());
		lista.add(new ContaCorrente());

		
		ContaCorrente c2 = new ContaCorrente();
		c2.depositar(1000);
		try {
			c2.sacar(100);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

		lista.add(c2);
		
		
		ContaCorrente c3 = new ContaCorrente();
		c3.depositar(1200);
		
		try {
			c3.sacar(200);
		} catch (SaldoInsuficienteException e) {
			
			e.printStackTrace();
		}
		lista.add(c3);
		
		
		
		
		
		
		
		for (ContaCorrente contaCorrente : lista) {
			System.out.println(contaCorrente.getSaldo());
		}
		
		
		
		
		

	}

}
