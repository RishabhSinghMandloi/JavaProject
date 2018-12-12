package com.functional.programs;
import java.util.Random;
import com.fucntion.utilities.*;
/*
 * Purpose: In this class we ensures that the the input which will we taken by the user must be displayed with message
 * @author Rishabh
 * @version 1.0
 * @since 12-12-2018
 */
public class FlipCoin {
   public static void main(String[] args){
	 System.out.println("How many times you want to flip the coin");
	 int times =Utility.getInt();                                     //this method returns the integer type value
	 System.out.println("Flip " +times+ " times the coin");
	 int headCount=0;                                 //variable contains the total no of head count
	 int tailCount=0;                                 //variable contains the total no of tail count  
	 Random rn=new Random();
	 for(int i=1;i<=times;i++)
	 {
		 if(rn.nextDouble()<0.5)  //this method genrate the random double value
		 tailCount++;
		 else 
	     headCount++;		 
	 }
	 System.out.println("No of time of heads " +headCount);
	 System.out.println("No of times of tails " +tailCount);
	 System.out.println("Percentage of heads " +(double)headCount/times*100);   //returns the percentage of headCounts
	 System.out.println("Percentage of tails " +(double)tailCount/times*100);   //returns the percentage of tailCounts
 }
}
