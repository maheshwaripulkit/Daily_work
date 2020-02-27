package com.cognizant.training.nestedclasses;

public class OuterAnother {
	int x = 23;
	private int y = 46;

	class Member {
		public void disply() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		OuterAnother out = new OuterAnother();
		OuterAnother.Member m = out.new Member();
		m.disply();
	}
}
