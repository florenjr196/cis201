/*
    Name: Jeremy Florence
    Course: CIS 201
    Section: 001
    Assignment: 7
*/

import java.util.*;

//This program will take a date entered by the user
//and find the day of the week
public class DayOfWeek {    
    public static void main(String[] args) {
	System.out.println("This program will tell you what day of the week\n"
			    + "a certain date falls on.\n");
	int month = date("What is the month (1 to 12)? ");
	int day = date("What is the day (1 to 31)? ");
	int year = date("What is the year (e.g., 2007)? ");
	int totalDays = fullYearDays(year) + pastLeapYearDays(year) + 
			  currentYearDays(month, day, year);
	System.out.println("Your date falls on a " + findDayOfWeek(totalDays));
	
    }
    
    //Prompts the user for input and returns an integer
    public static int date(String prompt) {
	Scanner sc = new Scanner(System.in);
	System.out.print(prompt);
	return sc.nextInt();
    }
    
    //Calculates the number of days for every normal FULL year
    //prior to the current year.
    public static int fullYearDays(int year) {
	return ((year - 1) * 365);
    }
    
    //Calculates the number of days added from leap years
    //prior to the current year.
    public static int pastLeapYearDays(int year) {
	int dayCounter = 0;
	
	//Initializes at year 1 and runs until the current year,
	//but not including it.
	for (int i = 1; i < year; i++) {
	    
	    //if the year is divisble by 400, not divisible by 100,
	    //or divisible by 4, add an extra day.
	    if ((i % 400 == 0) || (i % 100 != 0 && i % 4 == 0)) {
		dayCounter += 1;
	    }
	}
	return dayCounter;
    }
    
    public static int currentYearDays(int month, int day, int year) {
	int dayCounter = 0;
	
	//Initializes at 1(January), and runs until the current month,
	//but not including it.
	for (int i = 1; i < month; i++) {
	    
	    //If it's January, March, May, July, August, October, or December,
	    //add 31 days. For the rest except February, add 30 days.
	    if (i == 1 || i == 3 || i== 5 || i== 7 
		|| i == 8 || i== 10 || i== 12) {
		dayCounter += 31;
	    } else if (i != 2) {
		dayCounter += 30;
	    }
	    
	    //If the month is februrary, add 28 days. If it's a leap year,
	    //add one more.
	    if(i==2) {
	      dayCounter += 28;
	      // if its a leap year
	      if (year % 4 == 0) {
		  if (year % 400 == 0) {
		      dayCounter += 1;
		  }
		  dayCounter += 1;
	      }
	    }
	}
	
	//add the days of the current month
	//to the total number of days passed.
	dayCounter += day;
	return dayCounter;
    }
    
    //Determines what day of the week it is.
    public static String findDayOfWeek(int totalDays) {
	String currentDay = ""; 
	
	///If the remainder of the days divided by 7 is 1, it's Monday.
	if (totalDays % 7 == 1) {
	    currentDay = "Monday";
	}
	
	//If the remainder of the days divided by 7 is 2, it's Tuesday.
	if (totalDays % 7 == 2) {
	    currentDay = "Tuesday";
	}
	
	//If the remainder of the days divided by 7 is 3, it's Wednesday.
	if (totalDays % 7 == 3) {
	    currentDay = "Wednesday";
	}
	
	//If the remainder of the days divided by 7 is 4, it's Thursday.
	if (totalDays % 7 == 4) {
	    currentDay = "Thursday";
	}
	
	//If the remainder of the days divided by 7 is 5, it's Friday.
	if (totalDays % 7 == 5) {
	    currentDay = "Friday";
	}
	//If the remainder of the days divided by 7 is 6, it's Satuday.
	if (totalDays % 7 == 6) {
	    currentDay = "Saturday";
	}
	
	//If there is no remainder, it's Sunday.
	if (totalDays % 7 == 0) {
	    currentDay = "Sunday";
	}
	return currentDay;
    }
}