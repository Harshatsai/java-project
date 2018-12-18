import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;




public class ParsingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyy");
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the date in dd/MM/yyy format:");
        String input=scanner.nextLine();
        
        LocalDate enteredDate=LocalDate.parse(input,formatter);
        System.out.println("Entered date: "+ enteredDate);
        scanner.close();
		
	}

}
