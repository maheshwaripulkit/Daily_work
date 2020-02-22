package com.cts.training.file;

import java.util.Scanner;

public class StringQuestion2 {

	public static void main(String[] args) {
		String user="where were you yesterday?";
		Scanner sc = new Scanner(System.in);
		user = sc.next();
		String one = null,tow,three,four;
		char abcd;
		//System.out.println(user);
		// char ch[]=user.toCharArray();
		// int size=ch.length;
		for(int i=0;i<user.length();i++)
		{   
			
			 one=user.replaceAll("yes", "s");
			tow=user.replaceAll(" you", "u ");
			 three=user.replaceAll("today", "2day");
		four =user.replaceAll("why", "y");
		}
	System.out.println(one);
	}

}
