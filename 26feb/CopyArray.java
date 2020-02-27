package com.cognizant.training.questions;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int size=sc.nextInt();
		int array[]=new int[size];
		int arr[]=new int[size];
		for(int i=0;i<array.length;i++)
		{
			int j=i+1;
			System.out.println("Enter element "+j+ "=");
			array[i]=sc.nextInt();
			arr[i]=array[i];
		}
		System.out.println("Copied Array is  = ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
