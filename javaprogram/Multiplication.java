package com.cognizant.training;

import java.util.*;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose multiplication is required = ");
		int number = sc.nextInt();
		for (int i = 1; i <= 10; ++i) {
			System.out.println(number + "*" + i + "=" + number * i);
		}
	}

}
