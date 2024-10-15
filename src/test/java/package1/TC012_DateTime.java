package package1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class TC012_DateTime {
	public static void main(String[] args) {
		Instant currentTimesk=Instant.now();
		System.out.println(currentTimesk); //2024-10-14T04:31:04.803494600Z
		
		LocalDate nowsk=LocalDate.now();
		System.out.println(nowsk);//2024-10-14
		
		LocalDate independencesk=LocalDate.of(1947,Month.AUGUST , 04);
		System.out.println(independencesk);
		System.out.println(nowsk.plusDays(1));//2024-10-15
		
		System.out.println(nowsk.minusDays(1));//2024-10-13
		
		System.out.println(nowsk.minusMonths(1));//2024-09-14 
		
		System.out.println(nowsk.isLeapYear());//true 
		
		System.out.println("move 30 th day of the month "+nowsk.withDayOfMonth(20));//move 30 th day of the month 2024-10-20
		
		System.out.println("Training end date: "+nowsk.plusDays(48));//Training end date: 2024-12-01
		
		System.out.println(nowsk.minusMonths(1).getMonth()); //SEPTEMBER
		
		ZonedDateTime Ctsk=ZonedDateTime.now();
		System.out.println(Ctsk);//2024-10-14T10:16:03.160755+05:30[Asia/Calcutta]
		
		ZonedDateTime Ctskparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(Ctskparis);//2024-10-14T06:49:10.704403900+02:00[Europe/Paris]
		
		
		System.out.println(Ctskparis.plusDays(1));//2024-10-15T06:53:00.862994300+02:00[Europe/Paris]
		
		System.out.println(Ctskparis.minusDays(1));//2024-10-13T06:53:00.862994300+02:00[Europe/Paris]
		
		System.out.println(Ctskparis.minusMonths(1));//2024-09-14T06:53:00.862994300+02:00[Europe/Paris]
		
		//leap year finding not available in zoned time it is only available in local time
		
		System.out.println("move 30 th day of the month "+Ctskparis.withDayOfMonth(20));//move 30 th day of the month 2024-10-20T06:53:00.862994300+02:00[Europe/Paris]
		
		System.out.println("Training end date: "+Ctskparis.plusDays(48));//Training end date: 2024-12-01T06:55:57.434943300+01:00[Europe/Paris]
		
		System.out.println(Ctskparis.minusMonths(1).getMonth()); //SEPTEMBER
		
		
		LocalDate startDatesk=LocalDate.of(1947,06,15);
		LocalDate endDate=LocalDate.now();
		Period periodsk = startDatesk.until(endDate);
		
		System.out.println(startDatesk+"\n"+endDate+"\n"+periodsk);
//		1947-08-15
//		2024-10-14
//		P77Y1M29D

		System.out.println("Days: "+periodsk.get(ChronoUnit.DAYS));//Days:29 (14-15) 14 refers to the current date
		System.out.println("Months: "+periodsk.get(ChronoUnit.MONTHS));//Months:3(October-June)
		System.out.println("YEARS: "+periodsk.get(ChronoUnit.YEARS)); //YEARS: 77(2024-1947)
		
		
		
		
		
		DateTimeFormatter Timeformattersk=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(endDate.format(Timeformattersk));//14-Oct-2024
		System.out.println(endDate);//2024-10-14
		DateTimeFormatter Timeformattersk1=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(endDate.format(Timeformattersk1));//14 October 2024
		
		DateTimeFormatter Timeformattersk2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(endDate.format(Timeformattersk2));//14/10/2024
		
	}

}
