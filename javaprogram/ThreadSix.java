package com.cognizant.training.threaddemo;

public class ThreadSix implements Runnable {
	Resource resource;

	public ThreadSix(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.display("Thread -2");
	}
}
