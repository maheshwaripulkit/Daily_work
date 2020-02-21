package com.cognizant.training;

public class EmployeeCollectionExample implements Comparable<EmployeeCollectionExample> {
	int id;
	String name;
	String address;
	String designation;
	int age;
	double salary;
	long phone;

	public EmployeeCollectionExample() {
	}

	public EmployeeCollectionExample(int id, String name, String address, String designation, int age, double salary,
			long phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	

	@Override
	public String toString() {
		return "EmployeeCollectionExample [id=" + id + ", name=" + name + ", address=" + address + ", designation="
				+ designation + ", age=" + age + ", salary=" + salary + ", phone=" + phone + "]";
	}

	@Override
	public int compareTo(EmployeeCollectionExample emp) {
		if (this.age < emp.age) {
			return 1;

		} else if (this.age == emp.age)
			return 0;
		else {
			return -1;
		}

	}

}
