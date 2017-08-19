/*Neste caso eu posso importar um método estático de uma classe
 *e chamar os métodos de forma reduzida
 * 
 * */

import static java.lang.Math.round;
import static java.lang.System.out;

public class Aplicacao {

	public static void main(String[] args) {
	
	double d = round(10.9);
	
	out.println(d);
		
	}

}
