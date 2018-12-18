import java.util.Scanner;


public class Demo {
	public static void main(String args[])
	{
		 int UpperCount=0;
		 int LowerCount=0;
		 System.out.println("enter the character");
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        
	            if(!input.isEmpty())
	            {
	            	for(char ch:input.toCharArray())
	            	{
	            		if(!Character.isDigit(ch)&&Character.isAlphabetic(ch))
	            		{
	            			if(Character.isUpperCase(ch))
	            			{
	            				UpperCount++;
	            	
	            			}
	            			else
	            			{
	            				LowerCount++;
	            			}
	            		}
	            	}
	            	
	            }
	            System.out.println(UpperCount);
                System.out.println(LowerCount);
	                       
	            	
	}
}