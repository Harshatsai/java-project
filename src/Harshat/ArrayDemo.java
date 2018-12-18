package Harshat;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The sum of the elememts are:");
       int[] arr1=new int[]{1,2,36,44,5};
       for(int index:arr1)
       {
    	   System.out.println(index);
       }
       System.out.println("the number to be search is " +Arrays.binarySearch(arr1, 2));
       System.out.println("After sorting the elements are:");
       Arrays.sort(arr1);
       for(int index:arr1)
       {
    	   System.out.println(index);
       }
       int[] arr2=Arrays.copyOf(arr1, 2);
       System.out.println("After copying the elements are ");
       for(int index:arr2)
       {
    	   System.out.println(index);
       }
       int[] arr3=Arrays.copyOfRange(arr1, 1, 3);
       System.out.println("After copying the range of elements are ");
       for(int index:arr3)
       {
    	   System.out.println(index);
       }
	}

}
