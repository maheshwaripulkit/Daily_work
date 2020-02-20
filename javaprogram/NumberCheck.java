//Program to check if the number is positive or negative
package com.cognizant.training;
import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {

		double number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number = ");
	number=sc.nextDouble();
		if (number < 0.0)
			System.out.println(number + " is a negative number.");
		
		else if (number > 0.0)
			System.out.println(number + " is a positive number.");
		
		else
			System.out.println(number + " is 0.");
	}
}
