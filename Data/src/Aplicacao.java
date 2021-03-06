import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		/*
		 * Date e Calendar são legados
		 * 
		 * Calendar é utilizado para trabalhar com aritimética de datas 
		 * 
		 * 0 - Jan
		 * 1 - Fev
		 * 
		 * */
		
		
		/**/
		Date date = new Date();
		long mili = date.getTime();	
		
		System.out.println(mili);
		
		
		/*Opção 1 de preenchimento dos parâmetros calendar*/
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 1);		
		
		/*Opção 2 de preenchimento dos parâmetros calendar */
		cal.set(2020, 1, 5, 13, 30, 0);		
		
		/*Manipulando data*/
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MINUTE, -30);
		
		/*Para apresentar data que foi configurada manualmente*/
		Date d = cal.getTime();		
		System.out.println(d);
		
		/*conseguindo data e hora atual*/		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());

		/*Formatação de datas - Aparentemente não funcionou*/
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String f1 = df1.format(d);
		System.out.println(d);		
		
		
		/*Formatação de datas - Aparentemente também não funcionou*/
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG,new Locale("en","US") );
		String f2 = df2.format(d);
		System.out.println(d);
		
		SimpleDateFormat df5 = new SimpleDateFormat("yyyy-MM-dd");
		String f5 = df5.format(d);
		System.out.println(d);
		
		String sd1 = "2030-07-01";
		SimpleDateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
		  Date d1 = df6.parse(sd1);
		  System.out.println(df6);
		} catch (ParseException e) {
			e.printStackTrace();
		}	

	}

}
