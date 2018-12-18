package com.alogorithm.programs;
import com.fucntion.utilities.*;
public class ReadFile1 {
   public static void main(String[] args) {
     String array []=Utility.readFileToArray("fileName.txt");
for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
}
   }
}
