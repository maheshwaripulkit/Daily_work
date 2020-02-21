package com.cts.training.controller;

import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import java.util.Scanner;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
//		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
//		empObj.addEmployee(emp);
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the id = ");
//		int id = sc.nextInt();
//		Employee em = empObj.getEmployeeById(id);
//		System.out.println(em);
//		System.out.println("Delete");
//		System.out.println("Enter the id = ");
//		int id2 = sc.nextInt();
//		empObj.deleteEmployee(id2);
//		List<Employee> list = empObj.getAllEmployees();
//		list.forEach(System.out::println);
//		
		Employee emp = new Employee(234, "mahesh", "Bangalore", "Digital", 22, 34567.8, 23456678);

		System.out.println("Update");

		empObj.updateEmployee(emp);
		List<Employee> list2 = empObj.getAllEmployees();
		list2.forEach(System.out::println);
	}

}
