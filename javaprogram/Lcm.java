package com.cognizant.training;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number =  ");
		int number = sc.nextInt();
		System.out.println("Enter the second number =  ");
		int number2 = sc.nextInt();
		int gcd = 1;
		for (int i = 1; i <= number && i <= number2; i++) {

			if (number % i == 0 && number2 % i == 0)
				gcd = i;
		}
		int lcm = (number * number2) / gcd;
		System.out.printf("The LCM of two numbers is=" + lcm);
	}

}
