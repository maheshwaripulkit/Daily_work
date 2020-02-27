package com.cognizant.training.questions;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array= ");
		int size=sc.nextInt();
		int sum=0;
		int array[]=new int[size];
		int evenarray[]=new int[size];
		int oddarray[]=new int[size];
		int a=0,k=0;
		for(int i=0;i<array.length;i++)
		{
			int d=i+1;
			System.out.println("Enter element "+d+ "=");
			array[i]=sc.nextInt();
			
		}
		for(int j=0;j<array.length;j++)
		{
			if(array[j] % 2==0)
			{
				evenarray[a]=array[j];
				a++;
			}
			else
			{
				oddarray[k]=array[j];
			k++;
			}
		}
		System.out.println("Even array =");
		for(int j=0;j<evenarray.length;j++)
		{
			System.out.print(evenarray[j]+" ");
		}
		System.out.println();
		System.out.println("Odd array =");
		for(int j=0;j<evenarray.length;j++)
		{
			System.out.print(oddarray[j]+" ");
		}
	}

}
