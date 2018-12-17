package com.functional.programs;
import java.util.Random;
import java.util.Scanner;
import com.fucntion.utilities.*;
public class Gambler {
  public static void main(String[] args) {

	System.out.println("Enter your Name Gambler");
	String st=Utility.getString();
	Random rd=new Random();
	System.out.println("How Much Stake do you have " +st);
	int $Stake=Utility.getInt();
	System.out.println("What is Your Goal");
	int $goal= Utility.getInt();
	int winCount=0;
	int lossCount=0;   
	   while($Stake<=$goal&&$Stake>=0)
	   {
		 int randomNum = rd.nextInt(2);
		 if(randomNum==1)
		 {
			winCount++;
			$Stake=1+$Stake;
		 }
		 else {
			 lossCount++;
			 $Stake=$Stake-1;
			
		 }
	   }
	   if($Stake==0)
			 {
			   System.out.println("You dont have sufficient amount of money to play the game");	 
			 }
	   
	   if($Stake==$goal)
			{
			  System.out.println("You won the game");	
			}
	    int  totalNumberTurns=lossCount+winCount;
	    System.out.println("Total no of turns "+totalNumberTurns);
	   System.out.println("losses " +lossCount);
	   System.out.println("wins " +winCount);
	   System.out.println("Percentage of winCount " +(double)winCount/totalNumberTurns*100);
	   System.out.println("Percentage of winCount " +(double)lossCount/totalNumberTurns*100);
	}
}

