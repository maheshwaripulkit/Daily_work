package com.cognizant.training;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number =  ");
		int number = sc.nextInt();
		System.out.println("Enter the second number =  ");
		int number2 = sc.nextInt();

		while (number != number2) {
			if (number > number2)
				number -= number2;
			else
				number2 -= number;
		}
		System.out.println("G.C.D = " + number);
	}

}
