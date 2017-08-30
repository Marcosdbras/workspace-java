
public class Aplicacao {

	public static void main(String[] args) {
		int [] array = new int[5];
		
		array[0] = 1;
		array[2] = 3;
		
		for (int i = 0; i < array.length;i++) {
			
			System.out.println(i+" => "+array[i]);
			
		}
		
		//enhaced-for
		for (int i :array) {
			System.out.println(i);
		}
		
		String[] array2 = new String[7];
		
		array2[0] = "a";
		array2[1] = "b";
		
		for (String s : array2) {
			System.out.println(s);
		}
		
		Object[] array3 = new Object[7];
		array3[0] = "a";
		array3[1] = new Object();
		array3[2] = new int[3];
		array3[3] = 10;
		
		
		//Para realizar a leitura de tipos genéricos na array
		String e1 = (String) array3[0];
		int e2 = (int) array3[3];
		
		
		

	}

}
