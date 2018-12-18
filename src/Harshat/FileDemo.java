package Harshat;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		String str=args[0];
		File f=new File(str);
		 f.createNewFile();
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.length());
            
	}

}
