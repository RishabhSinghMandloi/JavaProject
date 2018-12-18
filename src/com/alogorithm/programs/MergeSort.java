package com.alogorithm.programs;
import com.fucntion.utilities.*;
public class MergeSort {
  public static void main(String[] args) {
    int array[]=Utility.readArray();
     Utility.mergeSort(array,0,array.length-1);
    // Utility.displayArray(array);
}
}
