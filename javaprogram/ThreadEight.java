package com.cognizant.training.threaddemo;

public class ThreadEight implements Runnable{
	ResourceExample resource;

	public ThreadEight(ResourceExample resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.tableOfFour("Thread -eight");
	}
}