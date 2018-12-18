package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MyStudentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ArrayList<MyStudent> arraylist=new ArrayList<MyStudent>();
                arraylist.add(new MyStudent("Harshat",25,543) );
                arraylist.add(new MyStudent("sree",23,584) );
                arraylist.add(new MyStudent("sai",21,526) );
                arraylist.add(new MyStudent("vishnu",20,974) );
                 Collections.sort(arraylist,new ComparatorDemo());
                java.util.Iterator<MyStudent> itr=arraylist.iterator();
                while(itr.hasNext())
                {
                	MyStudent str=itr.next();
                	System.out.println(str.studentName);
                }
                
               
                
	}

}
