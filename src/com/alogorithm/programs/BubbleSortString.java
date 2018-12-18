package com.alogorithm.programs;
import com.fucntion.utilities.*;
public class BubbleSortString {
   public static void main(String[] args) {
	 System.out.println("Enter the String");
	 String str=Utility.getString();
	 String array []=str.split(" ");
	 String result []= Utility.bubbleSortString(array);
	 Utility.displayArrayofString(result);
 }
}
