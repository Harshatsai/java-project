package accountTypes;

import account.Account;

public class SavingsAccount extends Account{
	 int customerAcNo=12334556;
	  
	     
	 public SavingsAccount() {
	       
		 System.out.println("savings account");
		
	}
	 
	public void account()
	 {
		super.account1();
		 System.out.println("The savings account number is "+customerAcNo);
		 
	 }
	 

}
