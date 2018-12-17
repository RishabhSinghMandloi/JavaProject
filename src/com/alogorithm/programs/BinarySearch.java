package com.alogorithm.programs;
import com.fucntion.utilities.*;
public class BinarySearch {
   public static void main(String[] args) {
	int arr[]=Utility.readArray();
	Utility.displayArray(arr);
	int lowValue=0;
	int highValue=arr.length-1;
   System.out.println("Enter the element you want to search");
    int ele=Utility.getInt();
    int result=Utility.binarySearch(arr, lowValue, highValue, ele);
    System.out.println(result);
    if(result==ele)
    	System.out.println(result+ " is present inside your array");
  }
}
