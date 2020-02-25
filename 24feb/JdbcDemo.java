package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		System.out.println("Connection established");
		Statement stmt = conn.createStatement();
		// String query = "insert into employee
		// values(4,'Ayush','Hyderabad',12,9826524545)";
		// String query = "delete from employee where employeeid =2;";
//		
//		int result = stmt.executeUpdate(query);
//		if (result > 0) {
//			System.out.println(result + " Record deleted succesfully");
//		} else {
//			System.out.println("Something went wrong ");
//		}
//	}
		String query = "select * from employee";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			int id = rs.getInt("employeeid");
			String name = rs.getString("employeename");
			String address = rs.getString(3);
			int age = rs.getInt(4);
			long phone = rs.getLong(5);
			System.out.println(id + ": " + name + " :" + address + " :" + age + " :" + phone);
		}
		
	}
}
