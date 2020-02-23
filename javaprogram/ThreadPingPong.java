package com.cognizant.training.threaddemo;

public class ThreadPingPong {

	public static void main(String[] args) {
		System.out.println("Player 1 ready");
		System.out.println("player 2 ready");
		ThreadPing one = new ThreadPing();
		ThreadPong two = new ThreadPong();
		Thread abcd = new Thread(one);
		Thread efg = new Thread(two);
		abcd.start();
		efg.start();

	}

}
