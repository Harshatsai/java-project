package Harshat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException, IOException {
		try
		
			
		(FileReader inputStream=new FileReader("C:\\Harshat\\Java project\\Harshat.txt");
	 FileWriter outputStream=new FileWriter("C:\\Harshat\\Java project\\Harshat.txt");)
				   {
			            int c;
			            while((c=inputStream.read())!=-1)
			            {
			            	outputStream.write(c);
			            }

	}catch(Exception e){
		    System.out.println(e.getMessage());
	}
	}

}
