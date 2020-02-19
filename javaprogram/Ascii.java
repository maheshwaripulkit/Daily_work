package com.cognizant.training;
import java.util.*;
public class Ascii {

	public static void main(String[] args) {
		char ch;
		int asciivalue;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		asciivalue=ch;
		System.out.println("The ascii value is "+ asciivalue);
	}

}
