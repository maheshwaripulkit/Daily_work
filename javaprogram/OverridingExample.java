package com.cognizant.training;

public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testify b=new testify();
	//	test a=new test();
		test a1=new  testify();
		a1.display();
	}

}

 class test
 {                                                 
	 int x=10;
	 public void display()
	 {
		 int y=20;
		 System.out.println("Class A");
	 }
 }
 class testify extends test
 {    @Override
	 public void display         ()
	 {
		 System.out.println("Class B");
		 
	 }
 }
 
 