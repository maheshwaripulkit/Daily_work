package com.cognizant.training.threaddemo;

public class ThreadThree implements Runnable {
	@Override
	public void run() {
		for (int i = 2; i < 10; i += 2) {
			System.out.println("Thread-3 : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
