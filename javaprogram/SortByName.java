package com.cognizant.training;

import java.util.Comparator;

public class SortByName implements Comparator<EmployeeCollectionExample> {

	@Override
	public int compare(EmployeeCollectionExample emp1, EmployeeCollectionExample emp2) {
		return emp1.getName().compareTo(emp2.getName());
		
	}

}
