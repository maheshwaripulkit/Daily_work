package com.cognizant.training;

import java.util.Comparator;

public class SortById implements Comparator<EmployeeCollectionExample> {

	@Override
	public int compare(EmployeeCollectionExample emp1, EmployeeCollectionExample emp2) {
		if (emp1.getId() > emp2.getId()) {
			return 1;

		} else if (emp1.getId() == emp2.getId()) {
			return 0;
		} else {
			return -1;
		}

	}

}
