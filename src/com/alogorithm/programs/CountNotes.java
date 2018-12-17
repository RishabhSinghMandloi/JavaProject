package com.alogorithm.programs;

import com.fucntion.utilities.Utility;

public class CountNotes {
   public static void main(String[] args) {
	System.out.println("How much amount do you want ?");
	int n=Utility.getInt();
	Utility.countNotes(n);
}
}
