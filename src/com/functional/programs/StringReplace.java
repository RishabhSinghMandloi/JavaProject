package com.functional.programs;
import com.fucntion.utilities.*;
/*
 * Purpose: In this class we ensures that the the input which will we taken by the user must be displayed with message
 * @author Rishabh
 * @version 1.0
 * @since 12-12-2018
 */
public class StringReplace {
    public static void main(String[] args) {
		System.out.println("Enter Your Name");
		/*
		 * this method returns the string type value 
		 * we have to catch that value by string type reference
		 */
	   String input= Utility.getString();
	   /*
	    * this condition checks weather the input string
	    * length is greater than 3 characters or not
	    */
	    if(input.length()>3)
	   System.out.println("Hello "  +input+ " how are you ?");
	}
}
