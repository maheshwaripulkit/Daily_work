package com.cognizant.training.threaddemo;

public class ThreadDemoOne {

	public static void main(String[] args) {

		ThreadOne tone = new ThreadOne();
		ThreadTwo ttwo = new ThreadTwo();

		tone.start();
		ttwo.start();

	}

}