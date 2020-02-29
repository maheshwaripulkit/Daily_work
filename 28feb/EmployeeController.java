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
		EmployeeDAO empObj = new EmployeeDAOImpl();
		Employee employee1 = empObj.getEmployeeById(1);
		employee1.setName("Neerja");
		empObj.updateEmployee(employee1);
		Employee emp=employeeDAO.getEmployeeById(111);
		employeeDAO.updateEmployee(employee1);
		List<Employee> list = empObj.getAllEmployees();
		list.forEach(System.out::println);
	}
}