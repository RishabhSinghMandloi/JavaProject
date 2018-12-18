package com.alogorithm.programs;
import com.fucntion.utilities.*;
public class MergeSortString {
   public static void main(String[] args) {
	System.out.println("Enter the String");
	String array[]=Utility.readInputString();
	Utility.mergeSortString(array, 0, array.length-1);
	Utility.dispalyStringArray(array);
}
}
