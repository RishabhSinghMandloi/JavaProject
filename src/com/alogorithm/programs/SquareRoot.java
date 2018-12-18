package com.alogorithm.programs;

import com.fucntion.utilities.Utility;

public class SquareRoot {
   public static void main(String[] args) {
	System.out.println("Enter the Number");
	double num = Utility.getDouble();
    double result=Utility.sqrt(num);
    System.out.println(result);
}
}
