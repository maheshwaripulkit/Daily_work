package com.cognizant.training.LambdaExpression;

public class LambdaExpresionExample {
	public static void main(String[] args) {
//		Runnable r = () -> System.out.println("hello runnable");
//		Thread t = new Thread(r);
//		t.start();
		Hello h=()->"Good morning ";
		System.out.println(h.greetings());
	}
}
@FunctionalInterface
interface Hello {
	String greetings();
   //public void disply();
}