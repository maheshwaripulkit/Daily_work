package com.cognizant.training;

public class StringExample {

	public static void main(String[] args) {
		String city1 = "Pune";
		String city2 = "Mumbai";
		String city3 = "Pune";
		String city4 = new String("Pune");
		String city5 = new String("Mumbai");
		String city6 = new String("Pune");
		System.out.println(city1 == city3);
		System.out.println(city1.equals(city3));
		System.out.println(city1 == city4);
		String msg = "Pulkit name is maheshwari";
		int len = msg.length();
		System.out.println("Length="+len );
		char ch = msg.charAt(4);
		System.out.println(ch);
		System.out.println(msg.substring(2, 4));
		System.out.println(msg.substring(2));
		System.out.println(msg.contains("Pulkit name is"));
		String joinString1=String.join("-","Pulkit"); 
		System.out.println(joinString1);
		System.out.println(msg.isEmpty()); 
		String replaceString=msg.replace('a','e');
		System.out.println(replaceString);  
		String[] words=msg.split("\\s");
		for(String w:words){  
			System.out.println(w);  
			}  
	}

}
