package com.cognizant.training.nestedclasses;

public class Outer2 {
	int x = 23;
	private int y = 45;
	public void read()
	{ 
		class inner
		{
			public void display()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
		inner l=new inner();
		l.display();
	}
	public static void main(String[] args) {
		Outer2 obj=new Outer2();
		obj.read();
	}	
    
}