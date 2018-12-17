package com.functional.programs;

import com.fucntion.utilities.Utility;

public class Coupans{
   public static void main(String[] args) {
	int array[]=Utility.readArray();
    int randomNumber=Utility.findTotalCoupans(array);
    System.out.println("Total Random Number needed to genrate disinct coupan is: "+randomNumber);
}
}
