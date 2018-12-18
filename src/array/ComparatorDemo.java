package array;

import java.util.Comparator;

public class ComparatorDemo implements Comparator
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}
    
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		 MyStudent s1=(MyStudent ) o1;;
		 MyStudent s2=(MyStudent ) o2;
		return s1.studentName.compareTo(s2.studentName);
		
	}
}

	
