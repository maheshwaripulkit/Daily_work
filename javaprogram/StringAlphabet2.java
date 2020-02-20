//Program to sort the string using Sort method
package com.cognizant.training;

import java.util.Arrays;
import java.util.Scanner;

public class StringAlphabet2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String name = sc.nextLine();
		String abcd = name.toLowerCase();
		char[] convert = abcd.toCharArray();
		char temp;
		int length = abcd.length();
		Arrays.sort(convert);
		for (int k = 0; k < length; k++) {
			System.out.print(convert[k]);
		}

	}
}
