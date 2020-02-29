package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;

public class EmployeeUnitTest {

	private static EmployeeDAO employeeDAO;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();

	}

	@Ignore
	@Test
	public void test_add_success() {
		Employee emp = new Employee(9, "Vijay", "mumbai", "Software programmer ", 22, 21700, 982348320);
		assertEquals(true, employeeDAO.saveEmployee(emp));

	}

	@Ignore
	@Test
	public void test_updateEmployee() {

		EmployeeDAO empObj = new EmployeeDAOImpl();
		Employee employee1 = empObj.getEmployeeById(1);
		employee1.setName("Neerja");
		empObj.updateEmployee(employee1);
		assertEquals(true, employeeDAO.updateEmployee(employee1));
	}

	@Ignore
	@Test
	public void test_delete_success() {
		EmployeeDAO empObj = new EmployeeDAOImpl();
		Employee emp = empObj.getEmployeeById(9);
		assertEquals(true, employeeDAO.deleteEmployee(emp));
	}

	@Ignore

	@Test
	public void test_get_employee_by_id_success() {
		Employee emp = employeeDAO.getEmployeeById(1);
		assertEquals("Neerja", emp.getName());
	}

	@Ignore
	@Test
	public void test_get_all_employee() {
		List<Employee> list = employeeDAO.getAllEmployees();

		assertEquals(5, list.size());
	}

	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_get_employee_by_id_success1() {
		Employee emp = employeeDAO.getEmployeeById(100);
		assertEquals("Neerja", emp.getName());
	}

	@Test(expected = NullPointerException.class)
	public void test_delete_success1() {
		employee = employeeDAO.getEmployeeById(10);
		assertEquals(false, employeeDAO.deleteEmployee(employee));
	}

	@Test(expected = NullPointerException.class)
	public void test_update_success1() {
		employee = employeeDAO.getEmployeeById(10);
		employee.setName("qwertr");
		assertEquals(false, employeeDAO.updateEmployee(employee));
	}
	
}