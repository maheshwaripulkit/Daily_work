package com.cognizant.training.questions;

public class GenericsType<T> {

	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}

	public static void main(String args[]){
			GenericsType<String> type = new GenericsType<>();
			type.set("Pulkit");
			String n = type.get();
			System.out.println(n);
			GenericsType type1 = new GenericsType(); 
			type1.set("Naveen");
			type1.set(10); 
			GenericsType<Integer> type2 = new GenericsType<>();
			System.out.println(type2);
		}
}
