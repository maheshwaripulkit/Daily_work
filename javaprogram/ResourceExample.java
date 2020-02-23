package com.cognizant.training.threaddemo;

public class ResourceExample {
	public void tableOfTwo(String name) {
		synchronized (this) {

			for (int i = 2; i <= 20; i+=2) {
				System.out.println("Table of 2 " + i + " -" + name);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void tableOfFour(String name) {
		synchronized (this) {

			for (int i = 4; i <= 40; i+=2) {
				System.out.println("Table of 4 " + i + " -" + name);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
