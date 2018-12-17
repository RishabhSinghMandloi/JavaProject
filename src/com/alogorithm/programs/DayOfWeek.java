package com.alogorithm.programs;
import com.fucntion.utilities.*;
public class DayOfWeek {
   public static void main(String[] args) {
	System.out.println("Enter the date in dd/mm/year format");
	int day=Utility.getInt();
	int month=Utility.getInt();
	int year=Utility.getInt();
	Utility.dayOfWeek(day, month, year);
}
}
