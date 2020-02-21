package com.cognizant.training;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String,Integer> map=new Hashtable<>();  
		map.put("Banana", 35);
		map.put("Orange",23);
		map.put("Mango",56);
		map.put("Grapes",21);
		map.put("Water Melon",10);
		map.put("Orange",70);
		//map.put(null,"0");
	//	map.put("Water",null);
		System.out.println(map);

	}

}
