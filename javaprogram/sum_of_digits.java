package com.cognizant.training;
import java.util.*;
public class sum_of_digits {

	public static void main(String[] args) {
		 int number;
		 int rem;
		 int sum=0;
		 Scanner sc=new Scanner(System.in);
		 number=sc.nextInt();
		 while(number!=0)
		 {
			 rem=number % 10;
			 sum=sum + rem;
			 number=number /10;
		 }
	
  System.out.println(sum);
	}

}
