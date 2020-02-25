package com.cts.training.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoThree {
	int id;
	String name;
	String address;
	String designation;
	int age;
	double salary;
	long phone;

	public void readData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter employee id = ");
		id = Integer.parseInt(br.readLine());
		System.out.print("Enter employee Name = ");
		name = br.readLine();
		System.out.print("Enter employee address = ");
		address = br.readLine();
		System.out.print("Enter employee age = ");
		age = Integer.parseInt(br.readLine());
		System.out.print("Enter employee phone number= ");
		phone = Long.parseLong(br.readLine());
		System.out.print("Enter employee salary= ");
		salary=Double.parseDouble(br.readLine());
		System.out.print("Enter employee designation= ");
		designation=br.readLine();
	}

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		JdbcDemoThree jd = new JdbcDemoThree();
		// jd.readData();
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection con = DriverManager.getConnection(url, "root", "root");
//		String query = "insert into employee values(?,?,?,?,?)";
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print("Enter employee id = ");
		// int id = Integer.parseInt(br.readLine());
		// System.out.print("Enter employee Name = ");
		// String name = br.readLine();
		// String query = "update employee set employeename=? where employeeid=?";
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	System.out.print("Enter employee id = ");
	//	int id = Integer.parseInt(br.readLine());
		//String query = "delete from employee where employeeid=?";

		//ps.setInt(1, id);
		// ps.setInt(2, id);
 String query="select * from employee";
 
	PreparedStatement ps = con.prepareStatement(query); 
	//ps.setInt(1, id);
//		ps.setString(2, jd.name);
//		ps.setString(3, jd.address);
//		ps.setInt(4, jd.age);
//		ps.setLong(5, jd.number);
		//int res = ps.executeUpdate();
	ResultSet rs=ps.executeQuery();
	int i=1;
	while(rs.next())
	{
		int ide = rs.getInt("employeeid");
		String name = rs.getString("employeename");
		String address = rs.getString("address");
		int age = rs.getInt("age");
		long phone = rs.getLong("phone");
		System.out.println("----Employee-"+i+"---record");
		System.out.println("employee id ="+ide);
		System.out.println("employee name ="+name);
		System.out.println("address="+address);
		System.out.println("age ="+age);
		System.out.println("phone="+phone);
		i++;
	}
		// System.out.println(res + " record inserted successfully");
		// System.out.println(res + " record updated successfully");
	//	System.out.println(res + " record deleted successfully");
	}

}
