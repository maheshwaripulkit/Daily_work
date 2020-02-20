package com.cognizant.training;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till you need fibonacci series = ");
		int number = sc.nextInt();
		int term1 = 0, term2 = 1;
		System.out.print(term1 + " ," + term2 + " ,");
		for (int i = 2; i <= number; i++) {

			int sum = term1 + term2;
			System.out.print(sum + " ,");
			term1 = term2;
			term2 = sum;
		}
	}

}
