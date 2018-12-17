package com.alogorithm.programs;
import com.fucntion.utilities.*;
/**
 * 
 * @author rishabh
 *
 */
public class InsertionSortString {
   public static void main(String[] args) {
	 System.out.println("Enter the Sentence");
	  String sentence=Utility.getString();
	  String array[]=sentence.split(" ");
	  System.out.println("The String in sorted order");
	  long start=System.nanoTime();
	String arr[]= Utility.insertionString(array);
	 long stop=System.nanoTime();
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]+"");
	 }
	 long result =stop - start;
	 System.out.println("Time taken for the method to get excute is: "+result);
}
}
