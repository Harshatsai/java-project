package array;

import java.util.ArrayList;

public class ArrayListDemo {
          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList arraylist=new ArrayList();
           arraylist.add("mouse");
           arraylist.add("keyboard");
           arraylist.add("monitor");
           arraylist.add("eclise");
           arraylist.add("Notepad");
         System.out.println("The elements in the Arraylist is");  
           System.out.println(arraylist);
           System.out.println("  ");
          ArrayList arrayList2=new ArrayList();
               arrayList2.add("mouse keyboard");
               arrayList2.add("eclipse Notepad");
           System.out.println("The elements present in the Arraylist2 is");    
            System.out.println(arrayList2);   
            System.out.println(" ");
          System.out.println("All elements present in the list are");  
           arraylist.addAll(arrayList2);
            System.out.println(arraylist);
             System.out.println(" ");
             if(arraylist.contains("mouse eclipse"))
             {
             System.out.println("The element is found in the list");
             }
             else 
             {
            	 System.out.println("The element is not present in the list");
             }
            
             
           
	}

}
