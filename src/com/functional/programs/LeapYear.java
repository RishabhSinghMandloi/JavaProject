package com.functional.programs;
import com.fucntion.utilities.Utility;
/*
 * @Purpose: In this class we check weather the year is Leap Year or not
 * @author Rishabh
 * @version 1.0
 * @since 12-12-2018
 */
public class LeapYear {
   public static void main(String[] args){
	System.out.println("Enter the Year");
	int year=Utility.getInt();            // we use this method to take the integer type input from the user
	if(year<1000)
	{
	  System.out.println("Enter the year which consist four digits");
	}
	else {
		if(year%4==0 && year%100!=0 || year%400==0)     //this is the condition to check for a Leap year
			System.out.println(year+ " is a Leap Year");
		else
			System.out.println(year+ " is not a Leap Year");
		}
}
}
