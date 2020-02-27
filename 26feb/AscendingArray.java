package com.cognizant.training.questions;

import java.util.Scanner;

public class AscendingArray {

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
		int temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Elements in ascending order ");
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}

	}
}
