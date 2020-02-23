package com.cognizant.training.threaddemo;

public class ThreadDemoTwo {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY -3);
		ThreadThree t3 = new ThreadThree();
		ThreadFour t4 = new ThreadFour();
		Thread t5 = new Thread(t3);
		Thread t6 = new Thread(t4);
		t5.start();
		t6.start();
		t5.setPriority(Thread.MAX_PRIORITY-2);
		t6.setPriority(Thread.NORM_PRIORITY-3);
		System.out.println("Main thread priority = "+Thread.currentThread().getPriority());
		System.out.println("Thread 3 priority = "+t5.getPriority());
		System.out.println("Thread 4 priority ="+t6.getPriority());
        
	}

}
