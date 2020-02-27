package com.cognizant.training.questions;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array= ");
		int size=sc.nextInt();
		int sum=0;
		int array[]=new int[size];
		for(int i=0;i<array.length;i++)
		{
			int j=i+1;
			System.out.println("Enter element "+j+ "=");
			array[i]=sc.nextInt();
			sum=sum + array[i];
		}
		System.out.println("Sum of Array = "+sum);
	
	}

}
