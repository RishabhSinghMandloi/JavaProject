import com.fucntion.utilities.Utility;

public class TempratureConversion {
   public static void main(String[] args) {
	 System.out.println("In which format do you want the tempratue");
     System.out.println("Press 1 for Faranite to Celsius format");
     System.out.println("Press 2 for celsius to faranite format");
     int n=Utility.getInt();
     
     if(n==1)
     {
       System.out.println("Enter the temprature");
       double temp1=Utility.getDouble();
       double result1=Utility. feraniteToCelsius(temp1);
       System.out.println("Temprature in celsuis format is: " +result1);		   
     }
     if(n==2)
     {
    	 System.out.println("Enter the temprature");
    	 double temp2=Utility.getDouble();
    	 double result2=Utility.celsiusToFaranite(temp2);
    	 System.out.println("Temprature in faranite format is: " +result2 );
     }
     else {
    	 System.out.println("Please enter the valid value");
     }
  }
}
