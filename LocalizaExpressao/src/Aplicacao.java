import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Encontrando uma ou mais letras minúsculas
		Pattern p = Pattern.compile("([a-z])+");
		Matcher m = p.matcher("a1bc2def3");
		
		while (m.find()) {
			
			int pos = m.start();
			String group = m.group();
			
			System.out.println(pos + " => "+group);
			
		}
		
		System.out.println();
		
		//Substituindo strings
		Pattern p1 = Pattern.compile("([a-z])");
		Matcher m1 = p1.matcher("a1bc2def3");
		
		StringBuffer sb = new StringBuffer();
		
		while (m1.find()) {
			
			int pos = m1.start();
			String group = m1.group();
			
			group = "?";
			m1.appendReplacement(sb, group);
			
			
			System.out.println(pos + " => "+group);
			
		}	
		
		m1.appendTail(sb);
		
		System.out.println(sb);
		
		
		
	}

}
