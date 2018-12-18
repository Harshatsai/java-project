package Harshat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileOutputStream fos=new FileOutputStream("C:\\Harshat\\Java project\\Harshat.txt");
	    DataOutputStream dos=new DataOutputStream(fos);
	      dos.writeByte(Byte.MAX_VALUE);
	      dos.writeShort(Short.MAX_VALUE);
	      dos.writeInt(Integer.MAX_VALUE);
	      dos.writeDouble(Double.MAX_VALUE);
	      dos.writeChar(Character.MAX_CODE_POINT);
	       fos.close();
	   FileInputStream fis=new FileInputStream("C:\\Harshat\\Java project\\Harshat.txt");
	     DataInputStream dis=new DataInputStream(fis);
	     System.out.println(dis.readByte());
	     System.out.println(dis.readShort());
	      System.out.println(dis.readInt());
	      System.out.println(dis.readDouble());
	      System.out.println(dis.readChar());
	     
	      
	      
	}

}
