package com.cts.training.file;

import java.util.*;

public class StringQuestion {

	public static void main(String[] args) {
		String[] s = { "100", "111", "10100", "10", "1111" };
		System.out.println("Enter the number you want to search = ");
		Scanner sc = new Scanner(System.in);
		String search = sc.next();
		int size = s.length;
		int count = 0;
		String one;
		for (int i = 0; i < size; i++) {
			one = s[i];
			if (one.startsWith(search) && !one.equals(search)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
