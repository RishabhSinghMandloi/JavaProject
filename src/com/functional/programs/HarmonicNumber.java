package com.functional.programs;
import com.fucntion.utilities.*;
/*
 * Purpose: In this class we print the sum of the harmonic number
 * @author Rishabh
 * @version 1.0
 * @since 12-12-2018
 */
public class HarmonicNumber {
   public static void main(String[] args) {
    System.out.println("Enter the Number");
    double number=Utility.getDouble();  //this method is used to read the double value from the user
    double sum=0;                       //we use a variable to store the sum
    for(double i=1;i<=number;i++)
    {
      sum=sum+1/i;	
    }
    System.out.println(sum);
}
}
