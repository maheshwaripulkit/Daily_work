package com.cognizant.training;
import java.util.Scanner;

	public class NumberOfOne {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int min = sc.nextInt();
			int max = sc.nextInt();
			int count = 0;
			for(int i = min; i<= max; i++)
			{
				int number = i;
				while(number != 0)
				{
					int digit = number % 10;
					if (digit == 1)
					{
						count++;
					}
					number = number / 10;
				}
			}
			System.out.println(count);
		}

}