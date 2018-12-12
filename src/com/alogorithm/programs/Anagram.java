package com.alogorithm.programs;
import com.fucntion.utilities.*;
/*
 * @Purpose:In this class we checks weather the two string are anagram or not 
 * which means that both the strings should contain the excatly same amount of characters
 * @author Rishabh
 * @version 1.0
 * @since 12-12-2018
 */
public class Anagram {
   public static void main(String[] args) {
	System.out.println("Enter the first sentence");
	String sentence1=Utility.getString();  //to take the string input from the user we use this method
	System.out.println("Enter the second sentence");
	String sentence2=Utility.getString();
	/*
	 * this method takes two string type as an argument 
	 * and returns the boolean value true if strings are anagram 
	 * and false if the strings are not anagram
	 */
  boolean rs=Utility.isAnagram(sentence1,sentence2);
	if(rs)
		System.out.println("The Entered String's are Anagram");
	else 
		System.out.println("The Entered String's are not Anagram");
}
}
