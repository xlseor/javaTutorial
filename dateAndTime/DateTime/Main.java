import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
	LocalDate myObj = LocalDate.now();
	System.out.println(myObj);
	LocalTime myTime = LocalTime.now();
	System.out.println(myTime);
	LocalDateTime myDateTime = LocalDateTime.now();
	System.out.println(myDateTime);
	DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter myFormatObj4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
	String formattedDate1 = myDateTime.format(myFormatObj1);
	String formattedDate2 = myDateTime.format(myFormatObj2);
	String formattedDate3 = myDateTime.format(myFormatObj3);
	String formattedDate4 = myDateTime.format(myFormatObj4);
	
	System.out.println("Formatted Date 1: " + formattedDate1);
	System.out.println("Formatted Date 2: " + formattedDate2);
	System.out.println("Formatted Date 3: " + formattedDate3);
	System.out.println("Formatted Date 4: " + formattedDate4);
	
       
    }
}

