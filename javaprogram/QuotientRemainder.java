package com.cognizant.training;
import java.util.*;
public class QuotientRemainder {

	public static void main(String[] args) {
	int number1,number2,quotient,remainder;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the dividend=");
    number1=sc.nextInt();
    System.out.println("enter the divisor=");
    number2=sc.nextInt();
    quotient = number1/ number2;
    remainder = number1 % number2;
    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
	}

}
