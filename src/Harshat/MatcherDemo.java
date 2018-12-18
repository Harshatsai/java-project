package Harshat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MatcherDemo {
	 void mat(String name)
	 {
		 Pattern pattern=Pattern.compile("[A-Z][a-z]{2,7}");
		 Matcher matcher=pattern.matcher(name);
		 System.out.println(matcher.matches());
	 }
	 void mobile(String mobileNumber)
	 {
		 Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
		 Matcher matcher=pattern.matcher(mobileNumber);
		 System.out.println(matcher.matches());
	 }
	 void mail(String mail)
	 {
		 Pattern pattern=Pattern.compile("+[a-z]");
		 Matcher matcher=pattern.matcher(mail);
		 System.out.println(matcher.matches());
	 }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input="Shop,Mop,Hopping,Chopping";
	       Pattern pattern=Pattern.compile("hop");
	       Matcher matcher=pattern.matcher(input);
	       System.out.println(matcher.matches());
	       while(matcher.find())
	       {
	    	   System.out.println(matcher.group()+": "+matcher.start());
	       }
	        MatcherDemo p1=new MatcherDemo();
	         p1.mobile("9618937222");

	}

}
