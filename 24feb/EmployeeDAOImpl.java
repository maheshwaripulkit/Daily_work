package com.cts.training.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection con = getConnection();
	
	PreparedStatement ps = null;

	

	@Override
	public boolean saveEmployee(Employee employee) {
		
		String query ="insert into employee values(?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, employee.getId());
		    ps.setString(2, employee.getName());
		    ps.setString(3, employee.getAddress());
		    ps.setString(4,employee.getDesignation());
		    ps.setInt(5,employee.getAge());
		    ps.setDouble(6, employee.getSalary());
		    ps.setLong(7,employee.getPhone());
		    ps.executeUpdate();
		    return true;
		   
	} catch(Exception e)
		{
		return false;
		}
	
	}
	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		String sql="select * from employee where id=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Employee emp=null;
			while (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getLong("phone"));
				emp.setDesignation(rs.getString("designation"));
				emp.setSalary(rs.getDouble("salary"));
				
			}
			return emp;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String query = "select * from employee";
		try {
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getLong("phone"));
				emp.setDesignation(rs.getString("designation"));
				emp.setSalary(rs.getDouble("salary"));
				employees.add(emp);
			}
			return employees;
		} catch (SQLException e) {

		}
		return null;
	}

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (Exception e) {
			return null;
		}

	}

}
