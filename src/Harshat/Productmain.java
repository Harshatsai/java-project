package Harshat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Productmain  {

	public static void main(String[] args) throws IOException
	{
		try
		(FileOutputStream fos=new FileOutputStream("Product");
		ObjectOutputStream oos=new ObjectOutputStream(fos);)
		{
			Product p=new Product(1422, "Harshat", 158999.85);
			  oos.writeObject(p);
			  oos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		(FileInputStream fos=new FileInputStream("Product");
		ObjectInputStream ois=new ObjectInputStream(fos);)
		{
			
			
			Product  p=(Product)ois.readObject();
			System.out.println(p);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
