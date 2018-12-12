package com.fucntion.utilities;
	import java.util.Scanner;
	public class Utility{
	   static Scanner sc=new Scanner(System.in);
	   /*
	     to take integer type input from the user we  use this method
	     
	    */
	   public static int getInt()
	   {
		 int i=sc.nextInt();
		 return i;
	   }
	   /* 
	    to  take string input from the user we use this method  
	    */
	   public static String getString()
	   {
		   
		   String st=sc.nextLine();
		   return st;
	   }
	   /*
	     to take double type input from the user we use this method
	    */
	   public static double getDouble()
	   {
		  Double d;
		  d=sc.nextDouble();
		  return d;
	   }
	   /*
	    to take float type input from the user we use this method
	    */
	   public static float getFloat()
	   {
		 Float f;
		 f=sc.nextFloat();
		 return f;
	   }
	   /*/
	    * to calculate the percentage 
	    * @param double value
	    * @param double totalValue
	    */
	   public static double getPercentage(double value,double totalValue)
	   {
		 double percentage = value/totalValue*100;
		 return percentage;
	   }
	   /*
	    * method to calculate the power
	    * @param base
	    * @param integer x 
	    */
	   public static int powerCount(int base,int x)
	   {
		 int pow=1;
		 while(x>0)
		 {
		  pow =pow*base;
		  x--;
		 }
		 return pow;
	   } 
	   /*
	    * this method checks weather the  number is prime no or not 
		* based on the boolean return type it returns true or false
		* @param integer n
	    */
	   public static boolean checkPrime(int n)
	   {
		 	  int i=2;            
		 	  while(i<=n/2) 
		 	  {
		 		  if(n%i==0)
		 		  return false;
		 		  i++;
		 	  }
		 	 return true;
		   }
	   /*/
	    *  this method takes integer number as an argument 
		*   and it checks first weather the number is prime or not 
		*   than it check that prime number is divisible by the input number
		*   @param integer n
	    */
	   public static void primeFactor(int n) 
	   {                                 
		 for(int i=2;i<=n;i++)
		 {
		   if(checkPrime(i)&&n%i==0)
		   {
			  System.out.println(i);
		   }
		 }
	   }
	   /*
	    * 
	    * this method checks weather the two string contain the same no of character values or not
	    * and it takes the two string type argument
	    * and the return type is true or false
	    * @param s1
	    * @param s2
	    */
     public static boolean isAnagram(String s1,String s2)
     {
    	 int c1[]=countAlphabet(s1);
   	  int c2[]=countAlphabet(s2);
   	  for(int i=0;i<26;i++)
   	  {
   		  if(c1[i]!=c2[i])
   			return false;
   	  }
   	  return true;
          
     }
	   /*
	    * this method takes string type as an argument 
	    * and it compares the count type array and it checks that the first 
	    * count type array is equal to second count type array or not
	    * @param String st
	    */
     public static int[] countAlphabet(String st)
     {
   	  int count[]=new int[26];
   	  for(int i=0;i<st.length();i++)
   	  {
   	   char ch=st.charAt(i);
   	   if(ch>='A'&&ch<='Z')
   		   count[ch-65]++;
   	   if(ch>='a'&&ch<='z')
   		   count[ch-97]++;
   	  }
   	  return count;
     }
	   /*
	    *this method is used to read the input 2d array from the user 
	    *which consist certain number of rows and coloumns
	    */
	  public static int [][] readMatrix()
	  {
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter the number of coloumns");
		int coloumns=sc.nextInt();
		int array[][]=new int[rows][coloumns];
		for(int i=0;i<rows;i++)
		{
		 System.out.println("Ënter the " +(i+1)+ " rows");
		 for(int j=0;j<coloumns;j++)
		 {
		   array[i][j]=sc.nextInt();	 
		 }
		}
		return array;
	  }
	  /*
	   *this method takes 2d array matrix as an argument 
	   *and display the matrix 
	   *@param mat[][]
	   */
	   public static void displayMatrix(int mat[][])
	   {
		 for(int i=0;i<mat.length;i++)
		 {
		    for(int j=0;j<mat[i].length;j++)
		    {
		    	System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		 }
	   }
	   /*
	    * this method is used to read the number of rows and coloumns from the user
	    * this method return the double type 2D array 
	    */
	public static double [][] readMatrix1()
	{
	   System.out.println("Enter the rows");	
	   int row=sc.nextInt();
	   System.out.println("Ënter the Coloumns");
	   int col=sc.nextInt();
	   double array [][]=new double[row][col];
	   for(int i=0;i<row;i++)
	   {
		 System.out.println("Enter " +(i+1)+ " rows");
		 for(int j=0;j<col;j++)
		 {
		   array[i][j]=sc.nextDouble();	 
		 }
	   }
	   return array;
	}
	
	/*
	 * this method takes the double type 2D array as an argument
	 * and display the matrix
	 * @param double mat[][]  
	 */
	public static void displayMatrix1(double mat[][])
	{
     for(int i=0;i<mat.length;i++)
     {
    	 for(int j=0;j<mat[i].length;j++)
    	 {
           System.out.print(mat[i][j]); 
    	 }
    	System.out.println();
      }
	}
}


