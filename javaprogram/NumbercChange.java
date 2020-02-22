package com.cts.training.file;

import java.util.*;

public class NumbercChange {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number till you want the pattern to print  = ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int start = 36;
		System.out.print(start + " ");
		for (int i = 1; i < number; i++) {

			if (i % 2 != 0) {
				start = start - 2;
				System.out.print(" " + start + " ");

			} else {

				start = start - 4;
				System.out.print(" " + start + "");
			}

		}
	}
}