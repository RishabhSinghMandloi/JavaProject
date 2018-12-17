package com.alogorithm.programs;

import com.fucntion.utilities.Utility;

public class MonthlyPayment {
    public static void main(String[] args) {
	  double amount=Double.parseDouble(args[0]);  
	  double intrest=Double.parseDouble(args[1]);
	  double year=Double.parseDouble(args[2]);
	  double payment=Utility.monthlyPayment(amount,year,intrest);
	  System.out.println("MonthlyPaymenet is : " +payment);
	}
}
