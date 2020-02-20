//Program to check leapyear or not
package com.cognizant.training;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year = ");
		year = sc.nextInt();
		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {

				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;
		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}

}
