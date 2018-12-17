package com.functional.programs;

import com.fucntion.utilities.Utility;

public class WindChill {
  public static void main(String[] args){
	  System.out.println("Enter the wind speed");
	double wind=Utility.getDouble();
	double result=Utility.getWindChill(55, wind);
	System.out.println(result);
}
}
