package com.fucntion.utilities;
	import java.time.Instant;
import java.util.Random;
import java.util.Scanner;
	public class Utility{
	   static Scanner sc=new Scanner(System.in);
	   /*
	    * to take integer type input from the user we  use this method
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
		   if(n==0||n==1)
			   return false;
		 	  int i=2;            
		 	  while(i<=n/2) 
		 	  {
		 		  if(n%i==0)
		 		  return false;
		 		  i++;
		 	  }
		 	 return true;
		   }
	   /**
	    * 
	    * @param n
	    * @return
	    */
	   public static boolean isPalindrome(int n)
	   {
		 int m=n;
		 int sum=0;
		 while(n!=0)
		 {
		   int r=n%10;
		   sum=sum*10+r;
		   n=n/10;
		   
		 }
		 if(m==sum)
			   return true;
		 return false;
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
   	  for(int i=0;i<36;i++)
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
   	  int count[]=new int[36];
   	  for(int i=0;i<st.length();i++)
   	  {
   	   char ch=st.charAt(i);
   	   if(ch>='A'&&ch<='Z')
   		   count[ch-65]++;
   	   if(ch>='a'&&ch<='z')
   		   count[ch-97]++;
   	   if(ch>='0'&&ch<='9')
   		   count[ch-22]++;
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
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return double type Distance
	 */
	public static double euclideanDistance(int num1,int num2)
    {
	  double distance=Math.sqrt(num1*num1+num2*num2);
	  return distance;
	}
	public static void stopWatch(){
	boolean flag=false;
	long start=0,end=0;
	while(true)
	{
	  System.out.println("Enter 0 to start and 1 to end");
	  int i=Utility.getInt();
	  if(i==0)
	  {
		start=Instant.now().toEpochMilli();
		flag=true;
	  }
	   if(i==1&&flag==true)
	   {
		 end=Instant.now().toEpochMilli();
		 break; 
	   }
	}
	System.out.println((end-start)/1000 +" seconds");
  }
	/**
	 * 
	 * @param str
	 * @param s
	 * @param f
	 * @param l
	 * @return String
	 */
	public static String permute(String str,String s,int f, int l)
	{
		if(f==l)
		{
		  str=str+s+" ";
		}else {
			for(int i=f;i<=l;i++)
			{
		      s=swapStringChar(s,f,i);
		      str=permute(str,s,f+1,l);
		      s=swapStringChar(s,f,i);
			}
		}
		return str;
	}
	/**
	 * 
	 * @param st
	 * @param first
	 * @param last
	 * @return string
	 */
	public static String swapStringChar(String st,int first,int last)
	{
		char ch[]=st.toCharArray();
		char temp=ch[first];
		ch[first]=ch[last];
		ch[last]=temp;;
		return String.valueOf(ch);
   }
	/**
	 * 
	 * @param t
	 * @param wind
	 * @return
	 */
	public static double getWindChill(double t,double wind)
	{
     double w=34.74+0.6215*t + (0.4275*t-35.75) * Math.pow(wind,.16);
     return w;
	}
     
	 /**
	  * method to read the array from the user
	  * @return array type integer
	  */
    public static int[] readArray()
    {
       System.out.println("Enter How many elements you want to store in the array");
       int n=sc.nextInt();
       int array[]=new int [n];
       System.out.println("enter " +n+" values");
       for(int i=0;i<array.length;i++)
       {
    	 array[i]=sc.nextInt();   
       }
       return array;
    }
    /**
     * method to display the array
     * @param arr
     */
    public static void displayArray(int arr[])
    {
      for(int i=0;i<arr.length;i++)
      {
    	System.out.println(i+"------> "+arr[i]);  
      }
    }
    /**
     * binary search method to find the element inside your array 
     * @param arr
     * @param low
     * @param high
     * @param element
     * @return integer value
     */
      public static int binarySearch(int arr[],int low,int high,int element)
      {
        if(low>high)
          return -1;
        int mid=(low+high)/2;
         if(arr[mid]==element)
          return mid;
         if(element<mid)
          return binarySearch(arr, low, mid-1, element);
          else
           return binarySearch(arr,mid+1, high,element);
      }
        /**
         * method of bubble sorting technique
         * @param ar
         * @param n
         */
    public static void bubbleSort(int ar[],int n)
    {
    	
      int temp;
      for(int round=1;round<=n-1;round++)
      {
    	 for(int i=0;i<=n-round-1;i++)
    	 {
    	   if(ar[i]>ar[i+1])
    	   {
    		 temp=ar[i];
    		 ar[i]=ar[i+1];
    		 ar[i+1]=temp;
    	   }
    		   
    	 }
      }
        for(int i=0;i<ar.length;i++)
        {
          System.out.println(ar[i]);	
        }
    }
           /**
            * method of insertion sorting technique   
            * @param arr
            */
       public static int[] insertionSort(int arr[])
       {
    	int  n=arr.length;
    	   for(int i=1;i<n;i++)
    	   {
    		 int key=arr[i];
    		 int j=i-1;
    		 while(j>=0&&arr[j]>key)
    		 {
    	       arr[j+1]=arr[j];
    	       j=j-1;
    		 }
    		 arr[j+1]=key;
    	   }
    	   return arr;
       }
       /**
        * 
        * @param str
        * @param low
        * @param high
        * @param st
        * @return integer index
        */
   public static int binarySearchString(String str[],int low , int high,String st)
   {
	  if(low>high)
	 return -1;
	  int mid=(low+high)/2;
	  if(str[mid].equals(st))
	  {
		 return mid;
	  }
	  else if(str[mid].compareTo(st)<0)
		  return binarySearchString(str,mid+1,high,st);
	  else
		  return binarySearchString(str,low,mid-1,st);
   }
   /**
    * 
    * @param str
    * @param low
    * @param high
    * @param st
    * return @
    */
   public static String [] insertionString(String str [])
   {
	 int n=str.length;
	   for(int i=1;i<n;i++)
	   {
		 String key=str[i];
		 int j=i-1;
		 while(j>=0&&str[j].compareTo(key)>0)
		 {
		   str[j+1]=str[j];
		    j--;
		 }
		  str[j+1]=key;
	   }
	   return str;
   }
   /**
    * method to find the distinct triplets which gives the the sum of zero
    * @param arr
    * 
    */
   public static void zeroSum(int arr[])
   {
	 int n=arr.length;
	 int brr[]=new int[n];
	 int index=0;
	 int sum;
	 int count=0;
	 for(int i=0;i<n-2;i++)
	 {
	   for(int j=i+1;j<n-1;j++)
	   {
		 for(int k=j+1;k<n;k++)
		 {
		   sum=arr[i]+arr[j]+arr[k];
		   if(sum==0) {
		     brr[index++]=arr[i];
		     brr[index++]=arr[j];
		     brr[index++]=arr[k];
		     arr[i]=arr[n-1];
		     arr[j]=arr[n-2];
		     arr[k]=arr[n-3];
		     n=n-3;
		     j--;
		     count++;
		     break;
		   }
		 }
	   }
	 }
	 int result[]=new int[index];
	 for(int i=0;i<result.length;i++)
	 {
	   result[i]=brr[i];
	 }
	   int no=2;
	   System.out.println("Total number of triplets is "+count);
	   for (int i = 0; i <result.length; i++) {
		   
		System.out.print(result[i]+" ");
		if(i==no){
			System.out.println();
			n=no+3;
		}
	}
   }
   /**
    * method to gentarate distinct coupans
    * @param coupans
    * @return integer value
    */
   public static int findTotalCoupans(int [] coupans)
   {
	   int i,count=0;
	   int last=coupans.length;
	   while(last>0)
	   {
		  Random rn=new Random();
		  int x=rn.nextInt(10);
		  
		  for(i=0;i<last;i++)
		  {
			 count++;
			 if(x==coupans[i])
			 {
				coupans[i]=coupans[last-i-1];
				last--;
				break;
			 }
		  }
	   }
	   return count;
   }
    public static void dayOfWeek(int day,int month,int year)
    {
       String array[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
       int y0= year-(14-month)/12;
       int x=y0+y0/4-y0/100+y0/400;
       int m0=month + 12 *((14 - month )/12) - 2;
       int d0=(day+x+31*m0/12)%7;
       System.out.println(array[d0]+ " is the day on " +day+"/"+month+"/"+year);
      }
    /**
     * method to calculate to convert the tempratue
     * @param temp
     * @return
     */
    public static double feraniteToCelsius(double temp)
    {
      return (temp-32)*(5/9.0);	   //faranite to celsius
    }
    /**
     * method to convert the temprature
     * @param temp
     * @return
     */
   public static double celsiusToFaranite(double temp)
   {
	 return (temp* 9/5)+32;     //celcius to faranite
   }
   /**
    * method to count the minimum number of notes
    * @param ruppes
    */
   public static void countNotes(int ruppes)
   {
	 int array[]= {1000,500,100,50,20,10,5,2,1};
	 int notes=0;
	 for(int i=0;i<array.length;i++)  //if ruppes==0
	 {
	   if(ruppes/array[i]>0)
	   {
		 System.out.println("Number of notes of "+array[i]+" is "+ruppes/array[i]);   
		 notes=notes+ruppes/array[i];
		 ruppes=ruppes%array[i];
	   }
	 }
	 System.out.println("Minimum number of notes required is: "+notes);
   } 
   /**
    * 
    * @param principal
    * @param year
    * @param rate
    * @return doubleType monthlyPayment
    */
     public static double monthlyPayment(double principal,double year,double rate) 
     {
        double n =12*year;
    	double r=rate/(12*100);
    	double payment= principal*r/(1-Math.pow((1+r),-n));
    	return payment;
     }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  



