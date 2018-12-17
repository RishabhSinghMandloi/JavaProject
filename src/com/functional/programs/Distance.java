package com.functional.programs;

import com.fucntion.utilities.Utility;

public class Distance{
   public static void main(String[] args) {
	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[0]);
	double result=Utility.euclideanDistance(n1, n2);
	System.out.println("euclideanDistancere: "+result);
}
}
