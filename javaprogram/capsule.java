package com.cognizant.training;

 class Example{
	 private int age;
	 private double salary;
	 public int getAge()
	 {
		 return age;
	 }
	 public void setAge(int age)
	 {
		 this.age=age;
		 
	 }
	 
}
 public class capsule
 {
	 public static void main(String[] args)
	 {
		 Example en=new Example();
		 en.setAge(45);
		 int age= en.getAge();
		 System.out.println(age);
	 }
 }
