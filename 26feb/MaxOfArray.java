package com.cognizant.training.questions;



import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array= ");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		for(int i=0;i<array.length;i++)
		{
			int j=i+1;
			System.out.println("Enter element "+j+ "=");
			array[i]=sc.nextInt();
			
		}
		int largest=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				largest=array[i];
			}
			
			
		}
		int smallest=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<smallest)
			{
				smallest=array[i];
			}
			
			
		}
		System.out.println("Smallest element of Array = "+smallest);
		System.out.println("Largest element of Array = "+largest);
	}

}
