//Program to check if entered character is Alphabet or not
package com.cognizant.training;

import java.util.*;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the character = ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int number = ch;
		if ((number >= 65 && number <= 90) || (number >= 97 && number <= 122))
			System.out.println(ch + " is an alphabet.");
		else
			System.out.println(ch + " is not an alphabet.");
	}
}
