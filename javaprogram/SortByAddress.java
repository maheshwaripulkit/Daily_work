package com.cognizant.training;

import java.util.Comparator;

public class SortByAddress implements Comparator<EmployeeCollectionExample> {

	@Override
	public int compare(EmployeeCollectionExample emp1, EmployeeCollectionExample emp2) {
	          return emp1.getAddress().compareTo(emp2.getAddress());

	}
	

}
