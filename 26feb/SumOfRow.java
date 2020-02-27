package com.cognizant.training.questions;

import java.util.Scanner;

public class SumOfRow {

	public void sumOfRow(int array[][], int row, int column) {

		for (int i = 0; i < row; i++) {
			int sum = 0;

			for (int j = 0; j < column; j++) {
				sum = sum + array[i][j];
			}
			int k = i + 1;
			System.out.println("Sum of Row " + k + " " + sum);
		}
	}

	public void sumOfColumn(int array[][], int row, int column) {

		for (int i = 0; i < row; i++) {
			int total = 0;
			for (int j = 0; j < column; j++) {
				total = total + array[j][i];
			}
			int k = i + 1;
			System.out.println("Sum of Column " + k + "  " + total);
		}
	}

	public void diagonal(int array[][], int row, int column) {
		int total = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j) {
					total = total + array[i][j];
				}
			}

		}
		System.out.println("Sum of Diagonal elements " + total);
	}

	public void divisble(int array[][], int row, int column) {
		int total = 0;
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {
				if (array[i][j] % 2 == 0 && array[i][j] % 3 == 0) {
					total = total + array[i][j];
				}
			}

		}
		System.out.println("Sum of  elements divible by 2 and 3  " + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row =");
		int row = sc.nextInt();
		System.out.println("Enter the number of column = ");
		int column = sc.nextInt();
		int array[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		SumOfRow sr = new SumOfRow();
		sr.sumOfRow(array, row, column);

		sr.sumOfColumn(array, row, column);
		sr.diagonal(array, row, column);
		sr.divisble(array, row, column);
	}

}
