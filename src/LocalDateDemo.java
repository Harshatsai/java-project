import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateDemo {

	  public static void main(String args[])
	  { 
		   LocalDate localDate=LocalDate.now();
		    System.out.println(localDate);
		     LocalDate independenceDay=LocalDate.of(1947, Month.AUGUST, 15);
		      System.out.println(independenceDay);
		     LocalDate lc=LocalDate.ofYearDay(1996,15 );  
		       System.out.println(lc);
		       System.out.println(localDate.plusDays(1));
		       System.out.println(localDate.minusDays(2));
		       System.out.println(localDate.withDayOfMonth(30));
		       System.out.println(localDate.lengthOfMonth());
		       ZonedDateTime currentTime=ZonedDateTime.now();
		       System.out.println("India: "+currentTime);
		       ZonedDateTime currentTimeInParis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		       System.out.println(currentTimeInParis);
		       DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		       DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		       DateTimeFormatter formatter2=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		       DateTimeFormatter formatter3=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		       System.out.println(localDate.format(formatter));
		       System.out.println(localDate.format(formatter1));
		       System.out.println(localDate.format(formatter2));
		       System.out.println(localDate.format(formatter3));
		      LocalDate dateOfBirth=LocalDate.of(1996, Month.SEPTEMBER, 15);
		       System.out.println("your date of birth is "+dateOfBirth);
		    		  Period period=dateOfBirth.until(localDate);
		    	System.out.println("your age is "+period.getYears());	  
		  
	  }
}
