package com.alogorithm.programs;
import java.util.Arrays;

import com.fucntion.utilities.*;
public class BinarySearchString {
   public static void main(String[] args) {
	   System.out.println("Enter the Sentence");
	 String word=Utility.getString();
	 String array[]=word.split(" ");
	 System.out.println("Enter the word you want to search");
	 String search=Utility.getString();
	int index=Utility.binarySearchString(array, 0, array.length,search);
	System.out.println(index);
}
}
