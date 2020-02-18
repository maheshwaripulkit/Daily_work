package com.cognizant.training;

import java.util.*;

class Person {

	String name;
	String gender;

}

class Employee extends Person {
	int employeeId = 23;

	void display() {
		System.out.println(employeeId + " " + name);
	}

}

class Manager extends Employee {
	String department = "working";
}

class Hr extends Employee {
	int hrId;

}

class Developer extends Manager {
	int projectId = 46;
	String technology = "Java";

	void display() {
		System.out.println(projectId + " " + technology + " " + department);
	}

}

class TestEngineer extends Manager {
	int testId;
	String domain;

}

public class human {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Developer devop = new Developer();
		devop.display();
		emp.name = "Pulkit";
		emp.display();
	}
}