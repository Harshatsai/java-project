package Harshat;

public class ThrowDemo {
         int a=10,b=2,c;
         int c1[]=new int[4];
         void divide()
         {
        	 try{
        		 c=a/b; 
        		 c1[3]=4;
        		 String s=null;  
        		 System.out.println(s.length());
        	 }
        	 
        	 catch(ArithmeticException ae){
        		         System.out.println("Exception" +ae);
        	 }
        	 catch(ArrayIndexOutOfBoundsException ai)
        	 {
        		 System.out.println("Array Index " +ai);
        	 }
        	 catch(NullPointerException  ne)
        	 {
        		 System.out.println("NullPointer " +ne);
        	 }
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               ThrowDemo t=new ThrowDemo();
                 t.divide();
                 
	}

}
