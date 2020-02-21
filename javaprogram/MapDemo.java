package com.cognizant.training;
import java.util.*;
import java.util.Map.Entry;
public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();  
		map.put("Banana", 35);
		map.put("Orange",23);
		map.put("Mango",56);
		map.put("Grapes",21);
		map.put("Water Melon",10);
		map.put("Orange",70);
		System.out.println(map);
		System.out.println(map.get("Banana"));
		int size=map.size();
		System.out.println(size);
		System.out.println("is empty or not = "+map.isEmpty());
		System.out.println("contains banana or not = " +map.containsKey("Banana"));
		for(Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey());
		}
		for(Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getValue());
		}
		for(Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey() +"  "+entry.getValue
					());
		}
		map.remove("Banana");
		System.out.println("After removing banana=  "+map);

	}

}


