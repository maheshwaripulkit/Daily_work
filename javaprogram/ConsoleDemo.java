package com.cts.training.file;

import java.io.Console;

public class ConsoleDemo {
	public static void main(String...args)
	{
		Console obj=System.console();
		System.out.println("Enter the name = ");
		String name = obj.readLine();
		System.out.println("name = "+name);
		System.out.println("Enter the password = ");
		char ch[]= obj.readPassword();
		String password= String.valueOf(ch);
		
		System.out.println("Password= "+password);
	}
}
