package com.cognizant.training.questions;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arraY = ");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<array.length;i++)
		{
			int j=i+1;
			System.out.println("Enter element "+j+ "=");
			array[i]=sc.nextInt();
		}
		System.out.println("ReverseArray = ");
		for(int i=array.length-1;i>=0;i--)
		{
			
			
			System.out.println(array[i]);
		}

	}

}
