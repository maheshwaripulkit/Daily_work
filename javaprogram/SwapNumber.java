package com.cognizant.training;
import java.util.*;
public class SwapNumber {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int number1,number2;
     System.out.println("Enter first number =");
     number1=sc.nextInt();
     System.out.println("Enter second number =");
     number2=sc.nextInt();
     number1=number1 - number2;
     number2 = number1 + number2;
     number1 = number2 - number1;
     System.out.println("First number = " + number1);
     System.out.println("Second number = " + number2);
	}

}
