package java8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneOffsetTransitionRule;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate olimpiadasRio = LocalDate.of(2016, Month.AUGUST, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println("Faltam " + anos + " para as olimpiadas");
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo);
		
		LocalDate proximas = olimpiadasRio.plusYears(4);
		System.out.println(olimpiadasRio);
		System.out.println(proximas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(formatador));
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		System.out.println(LocalTime.now());
		
		
		//***************
		
		System.out.println(ZoneId.systemDefault());
		
		System.out.println(ZoneOffset.getAvailableZoneIds());
		
		
		//////////////////
		
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		 
		LocalDateTime fimDoHorarioDeVerao2013SemFusoHorario = 
		  LocalDateTime.of(2014, Month.FEBRUARY, 15, 23, 00);
		 
		ZonedDateTime fimDoHorarioVerao2013ComFusoHorario = 
		  fimDoHorarioDeVerao2013SemFusoHorario.atZone(fusoHorarioDeSaoPaulo);
		System.out.println(fimDoHorarioVerao2013ComFusoHorario); //2014-02-15T23:00-02:00[America/Sao_Paulo]
		 
		ZonedDateTime maisUmaHora = 
		  fimDoHorarioVerao2013ComFusoHorario.plusHours(1);
		System.out.println(maisUmaHora); //2014-02-15T23:00-03:00[America/Sao_Paulo]
		
//		System.out.println(LocalDateTime.now());
//		Thread.sleep(5000);
//		System.out.println(LocalDateTime.now());
//		
//		Clock clock = Clock.fixed(Instant.now(), ZoneId.of("America/Sao_Paulo"));
//		System.out.println(LocalDateTime.now());
//		Thread.sleep(5000);
//		System.out.println(LocalDateTime.now(clock));
		
		
		Calendar dataEspecifica = new Calendar.Builder().setDate(2014, Calendar.MARCH, 8)  
		        .setTimeOfDay(10, 2, 57)  
		        .setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"))  
		        .setLocale(new Locale("pt", "br"))
		        .build();  
		
		if (TimeZone.getDefault().inDaylightTime(new Date())) {
			System.out.println("Estamos em horário de verão.");
		} else {
			System.out.println("Não estamos em horário de verão.");
		}
		
		
		System.out.println(Instant.now());
		System.out.println(LocalDateTime.now());
		
		// GTM -3:00 hor�rio de Bras�lia.
//		SimpleTimeZone stz = new SimpleTimeZone(0, "Etc/GMT-3");
		SimpleTimeZone stz = new SimpleTimeZone(-3 * 60 * 60 * 1000, "America/Sao_Paulo");
//		stz.setStartRule(dataInicio.get(Calendar.MONTH), dataInicio.get(Calendar.DAY_OF_MONTH), 1); //  1 milisegundo  
//		stz.setEndRule  (dataFim.get(Calendar.MONTH), dataFim.get(Calendar.DAY_OF_MONTH), 1); // 1 milisegundo
		TimeZone.setDefault(stz);
		
		System.out.println(new Date());
		System.out.println(LocalDateTime.now());
		System.out.println(Instant.now());
		System.out.println(ZoneId.systemDefault());
		
	}

}
