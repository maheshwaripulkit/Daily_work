package com.cognizant.training;
import java.util.Scanner;

public class Palindrome {
	
	    public static void main(String args[])
	    {
	        String name, name2 = "";
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the string =");
	        name = s.nextLine();
	        int length = name.length();
	        for(int i = length - 1; i >= 0; i--)
	        {
	            name2 = name2 + name.charAt(i);
	        }
	        if(name.equalsIgnoreCase(name2))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	    }
	}

