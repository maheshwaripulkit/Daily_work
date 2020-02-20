//Program to calculate sum of natural numbers
package com.cognizant.training;

import java.util.*;

public class SumOfNatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till which sum is required = ");
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {

			sum += i;
		}
		System.out.println("Sum = " + sum);
	}

}
