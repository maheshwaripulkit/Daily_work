package com.cognizant.training;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();  
		map.put("Banana", 35);
		map.put("Orange",23);
		map.put("Mango",56);
		map.put("Grapes",21);
		map.put("Water Melon",10);
		map.put("Orange",70);
		System.out.println(map);
	}

}
