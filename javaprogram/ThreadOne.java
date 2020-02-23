package com.cognizant.training.threaddemo;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 10; i+=2) {
			System.out.println("Thread-1  : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
