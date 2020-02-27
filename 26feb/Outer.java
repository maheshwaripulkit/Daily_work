package com.cognizant.training.nestedclasses;

public class Outer {

	int i=23;
	static int y=212;
	static class Inner{
		public void diplay()
		{
			System.out.println(y);
			
		}
	}
	
	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner obj=new Outer.Inner();
		obj.diplay();
		System.out.println(out.i);
		
	}
}
