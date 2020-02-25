package com.cts.training.controller;

import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import java.util.Scanner;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		//Employee employee = new Employee(111, "abhishek", "bhopal", "se", 23, 5467, 3456578);

		//employeeDAO.saveEmployee(employee);
		Employee emp=employeeDAO.getEmployeeById(111);
		System.out.println(emp);
	}
}