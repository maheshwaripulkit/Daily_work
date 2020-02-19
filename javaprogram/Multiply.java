package com.cognizant.training;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		float number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number = ");
		number1=sc.nextFloat();
		System.out.println("Enter second number = ");
		number2=sc.nextFloat();
		float number3=number1 * number2;
	    System.out.println("Multiplication " + number3);


	}

}
