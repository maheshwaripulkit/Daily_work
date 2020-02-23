package com.cognizant.training.threaddemo;

public class ThreadExample {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		// [main,5,main] this main is the name of the current thread 5 is the priority
		System.out.println("Name of Thread = " + t.getName());
		System.out.println("get the id of the thread " + t.getId());
		t.setName("threadname changed");
		System.out.println("Name of thread changed" + t);
		System.out.println("Priority of the thread " + t.getPriority());
		System.out.println("is it daemon thread or not " + t.isDaemon());
		System.out.println("Thread is Alive or not =" + t.isAlive());
	}

}
