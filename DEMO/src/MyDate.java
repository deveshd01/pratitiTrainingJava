import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// MyDate.java
public class MyDate {
	public static void main(String[] args) {
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
		  LocalDateTime now = LocalDateTime.now();  
		  System.out.println(dtf.format(now));  
		  dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		  now = LocalDateTime.now();  
		  System.out.println(dtf.format(now));  
		   
	   	  Calendar one = new GregorianCalendar(2010, Calendar.JULY, 10);
	      int day = one.get(Calendar.DAY_OF_WEEK);
	      System.out.println("/*/*/*"+day);
		      
	      Calendar calNewYork = Calendar.getInstance();
	      calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	 	  System.out.println("\n\n\n"); 
	      System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
	         + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));	 		   
	}
}
