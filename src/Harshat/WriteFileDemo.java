package Harshat;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) throws IOException {
		 
		  
		FileOutputStream fos=new FileOutputStream("C:\\Harshat\\Java project\\Harshat.txt");
		 String str="welcome to the notepad";
		  byte[] b=str.getBytes();
		     fos.write(b);
		     fos.close();
		   FileInputStream fis=new FileInputStream("C:\\Harshat\\Java project\\Harshat.txt");     
	         int i=0;
	         while((i=fis.read())!=-1)
	         {
	        	 System.out.print((char)i );
	         }
		  
	           
	
	}
	

}
