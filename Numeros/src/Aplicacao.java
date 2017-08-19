import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		
		double d = 1145.4;
		
		
		/*Formatação de número no padrão Brasileiro*/
		NumberFormat nf1 = NumberFormat.getNumberInstance();
		String s1 = nf1.format(d);
		System.out.println("Formatação de número no padrão Brasileiro "+s1);
		
		/*Foprmatação de número padrão norte americano*/
		NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("en","US") );
		String s2 = nf2.format(d);
		System.out.println("Foprmatação de número padrão norte americano "+s2);
		

		/*Formatação de moeda no padrão Brasileiro*/
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		String s3 = nf3.format(d);
		System.out.println("Formatação de moeda no padrão Brasileiro "+s3);
		
		/*Foprmatação de moeda padrão norte americano*/
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en","US") );
		String s4 = nf4.format(d);
		System.out.println("Formatação de moeda padrão norte americano "+s4);
		
		/*Outras formatações*/
		DecimalFormat df1 = new DecimalFormat("00000.000");
		String s5 = df1.format(d);
		System.out.println(s5);
				
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('-');
		
		DecimalFormat df2 = new DecimalFormat("00,000.000");
		df2.setDecimalFormatSymbols(dfs);
		df2.setGroupingUsed(true);
		
		String s6 = df2.format(d);
		System.out.println(s6);
		
		/*ctrl+shit+o para colocar imports automaticamente*/
		
		}

}
