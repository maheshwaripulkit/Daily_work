package com.cognizant.training.questions;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array= ");
		int size = sc.nextInt();

		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			int j = i + 1;
			System.out.println("Enter element " + j + "=");
			array[i] = sc.nextInt();

		}
		int largest = array[0];
		int secondlargest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				secondlargest = largest;
				largest = array[i];
			} else if (array[i] > secondlargest) {
				secondlargest = array[i];
			}
		}
		System.out.println("Second largest element is " + secondlargest);
	}
}
