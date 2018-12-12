package com.functional.programs;
import com.fucntion.utilities.*;
/*
 * @Purpose: In this class we ensures that the power of two is to printed upto the given input
 * @author Rishabh
 * @version 1.0
 * @since 12-12-2018
 */
public class PrintTable {
   public static void main(String[] args) {
	 System.out.println("Enter the Number");
	 int number=Utility.getInt();  // we use this method to take integer type input from the user
	 if(number>31)                //this is the condition that our number should not be greater than 31
	 {
	   System.out.println("Number is out of Range");
	 }
	 else
	 {
	    for(int i=0;i<number;i++)
	    {
	    	/*
	    	 *  we use this method to calculate the power fucntion 
	         *   it takes two integer type as an argument 
	         *   one argument is base and the another one value of number    
	    	 */
	    	System.out.println(Utility.powerCount(2, i)); 
	    }
	      
	 }
}
}
