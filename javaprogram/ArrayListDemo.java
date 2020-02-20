package com.cognizant.training;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.LinkedList;
public class ArrayListDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> list = new LinkedHashSet();
		list.add("Hello");
		list.add("my");
		list.add("dear");
		list.add("friend");
		list.add("7");
		list.add("true");

		System.out.println(list);
		list.remove(2);
	//list.add(2, "java");
		System.out.println(list.contains("java"));
		System.out.println("List size =  " + list.size());
		for (String obj : list) {
			System.out.println(obj);
			if (obj.equals("7")) {
				break;

			}
		}
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			String element=it.next();
			System.out.println(element);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		}
	//	ListIterator<String> to=list.listIterator();
	//	System.out.println("fwd direction ");
	//	while(to.hasNext())
	//	{
	//		String element=to.next();
	//		System.out.println(element);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	//	}
	//	System.out.println("backward direction ");
	//	while(to.hasPrevious())
	//	{
	//		String element=to.previous();
	//		System.out.println(element);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	//	}
	//	System.out.println(list.get(2));
	}
}
