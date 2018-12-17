package com.functional.programs;

import com.fucntion.utilities.Utility;

public class PermuteString {
  public static void main(String[] args) {
	  System.out.println("Enter the String");
	String st=Utility.getString();
	String result=Utility.permute("", st, 0, st.length()-1);
	System.out.println(result);
}
}
