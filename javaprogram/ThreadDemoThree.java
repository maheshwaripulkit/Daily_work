package com.cognizant.training.threaddemo;

public class ThreadDemoThree {

	public static void main(String[] args) {
		Resource res=new Resource();
		ThreadFive t8=new ThreadFive(res);	
		ThreadSix t9=new ThreadSix(res);	
		Thread t11=new Thread(t8);
		Thread t12=new Thread(t9);
		t11.start();
		t12.start();
	}

}
