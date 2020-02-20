//Program to toggle String 
package com.cognizant.training;

import java.util.*;

public class Toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String name = sc.nextLine();
		char[] convert = name.toCharArray();
		int length = convert.length;
		char temp;
		for (int i = 0; i < convert.length; i++) {
			if (convert[i] >= 'A' && convert[i] <= 'Z') {
				convert[i] = (char) ((int) convert[i] + 32);
			} else if (convert[i] >= 'a' && convert[i] <= 'z') {
				convert[i] = (char) ((int) convert[i] - 32);
			}
		}
		System.out.println("The toggled string is :-");
		for (int b = 0; b < convert.length; b++)
			System.out.print(convert[b]);
	}
}
