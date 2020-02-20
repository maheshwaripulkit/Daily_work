//Program to find factorial of a number
package com.cognizant.training;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int number = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++) {

			factorial *= i;
		}
		System.out.println("Factorial of " + number + "=" + factorial);
	}

}
