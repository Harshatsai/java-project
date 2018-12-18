import java.util.Scanner;


public class Fibonacci {
	 int fib1=0,fib2=1,fib3=0;
	 
	   void fib()
	   {
		   System.out.println("enter the number");
		   Scanner s=new Scanner(System.in);
			 int n=s.nextInt();
			 System.out.println("The sum of series is" );
		   for(int i=1;i<=n;i++)
		   {
			   System.out.println(fib3);
			 fib3=fib1+fib2;
			 fib1=fib2;
			 fib2=fib3;
		   
		   
		  
	   }
		   
			  
		  
	   }
	   
	     public static void main(String args[])
	     {
	    	 Fibonacci f=new Fibonacci();
	    	   f.fib();
	    	   
	     }

}
