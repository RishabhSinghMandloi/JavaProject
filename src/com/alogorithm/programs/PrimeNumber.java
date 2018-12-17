package com.alogorithm.programs;
import com.fucntion.utilities.*;
public class PrimeNumber {
   public static void main(String[] args) {
	//System.out.println("Enter the Number");
	int num=1000;
	for(int i=0;i<num;i++)
	{
	  boolean rs=Utility.checkPrime(i);
	  if(rs)
	  {
		if(Utility.isPalindrome(i))
		 System.out.println(i+" ");
	  }
	}
}
}
