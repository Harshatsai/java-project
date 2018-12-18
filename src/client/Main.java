package client;

import accountTypes.CurrentAccount;
import accountTypes.SavingsAccount;
public class Main {
     public static void main(String args[])
     {
    	  CurrentAccount c=new CurrentAccount();
    	  SavingsAccount s=new SavingsAccount();
    	  
    	    s.account1();
    	    s.account1(1,3);
    	    s.account1(1,2,4);
    	    System.out.println();
     }
}
