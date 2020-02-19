package com.cognizant.training;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("My name is Pulkit Maheshwari");
		System.out.println(sb.capacity());
		sb.append("I am a java developer ");
		System.out.println(sb.capacity());
		sb.insert(2,"core");
		System.out.println(sb);
		sb.replace(3, 10, "Trying to insert");
		System.out.println(sb);
		sb.delete(3, 15);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
