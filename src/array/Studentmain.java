package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ArrayList<Student> arraylist=new ArrayList<Student>();
                arraylist.add(new Student("Harshat",25,543) );
                arraylist.add(new Student("sree",23,584) );
                arraylist.add(new Student("sai",21,526) );
                arraylist.add(new Student("vishnu",20,974) );
                for(Student st:arraylist )
                {
                	System.out.println(st.age);
                }
                Collections.sort(arraylist);
                System.out.println("After sorting the values are:");
                for(Student st:arraylist )
                {
                	System.out.println(st.age);
                }
               
                
	}

}
