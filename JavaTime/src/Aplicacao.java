import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicacao {

	public static void main(String[] args) {
		String dataNascimento = "28/05/1973 22:00";
		
		
		LocalDateTime d1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

		
		LocalDateTime d2 = LocalDateTime.now();
		
		
		Duration d = Duration.between(d1, d2);
		
		System.out.println("Horas vividas: "+d.toHours());
		System.out.println("Dias Vividos "+d.toDays());
		
		
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		System.out.println("Meses vividos: "+p.toTotalMonths());
		
		
		System.out.println("Semanas vividas: "+ChronoUnit.WEEKS.between(d1, d2));
		
		System.out.println("Anos vividos: "+ChronoUnit.YEARS.between(d1, d2));
		
		
	}

}
