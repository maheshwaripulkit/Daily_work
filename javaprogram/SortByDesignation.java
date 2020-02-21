package com.cognizant.training;

import java.util.Comparator;

public class SortByDesignation implements Comparator<EmployeeCollectionExample> {

	@Override
	public int compare(EmployeeCollectionExample emp1, EmployeeCollectionExample emp2) {
		return emp1.getDesignation().compareTo(emp2.getDesignation());
		
	}
	

}
