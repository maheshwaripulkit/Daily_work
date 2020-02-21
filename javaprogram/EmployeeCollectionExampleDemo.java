package com.cognizant.training;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeCollectionExampleDemo {

	public static void main(String[] args) {

		ArrayList<EmployeeCollectionExample> list = new ArrayList<>();
		addEmployess(list);
		SortById sd = new SortById();
		
		//Collections.sort(list, sd);
		//Collections.sort(list,new SortByName());
	//	Collections.sort(list,new SortByAddress());
		// System.out.println(list);
		Collections.sort(list,new SortByDesignation());
		for (EmployeeCollectionExample emp : list) {
			System.out.println(list);
		}

	}

	private static void addEmployess(ArrayList<EmployeeCollectionExample> list) {

		EmployeeCollectionExample emp1 = new EmployeeCollectionExample(4234, "Vijay", "Bangalore", "Developer", 20,
				41241.86, 798546782);
		EmployeeCollectionExample emp2 = new EmployeeCollectionExample(2324, "Neeraj", "Pune", "Software Developer", 22,
				41241.66, 798546787);
		EmployeeCollectionExample emp3 = new EmployeeCollectionExample(2134, "Pulkit", "Karnataka",
				"Full Stack Developer", 22, 41241.80, 798546781);
		EmployeeCollectionExample emp4 = new EmployeeCollectionExample(5234, "Archil", "hyderabad", "test Developer",
				26, 31241.86, 49854645);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
	}

}
