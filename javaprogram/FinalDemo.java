package com.cognizant.training;

public class FinalDemo {
	public  final int X;

	FinalDemo() {
		X = 23;
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		System.out.println(fd.X);

	}

}
