package Harshat;

import java.util.Scanner;

public class AgeExceptionmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner s=new Scanner(System.in);
             System.out.println("Enter yr age");
              int age=s.nextInt();
              try
              {
            	  if(age<15)
            		   throw new AgeException("Invalid age");
            	  else
            		  
            		  System.out.println("Valid age");
              }
              catch(AgeException a)
              {
            	  System.out.println(a);
              }
	}

}
