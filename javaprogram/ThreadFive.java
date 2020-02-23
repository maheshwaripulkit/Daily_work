package com.cognizant.training.threaddemo;

public class ThreadFive implements Runnable {
	Resource resource;

	public ThreadFive(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.display("Thread -1");
	}
}
