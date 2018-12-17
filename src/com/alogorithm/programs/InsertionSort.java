package com.alogorithm.programs;
import com.fucntion.utilities.*;
public class InsertionSort {
   public static void main(String[] args) {
	int array[]=Utility.readArray();
	int sortedArray[]=Utility.insertionSort(array);
	Utility.displayArray(sortedArray);
}
}
