package com.functional.programs;
import com.fucntion.utilities.*;
/*
 * @Purpose: In this class we check weather the year is Leap Year or not
 * @author Rishabh
 * @version 1.0
 * @since 12-12-2018
 */
public class PrimeFactors{
    public static void main(String[] args) {
		System.out.println("Enter the Number");
		int num=Utility.getInt();
		/*this method takes integer number as an a argument
		 * and checks weather it a prime factor or not
		 * @param num
        */		
		Utility.primeFactor(num); 
	}
}
