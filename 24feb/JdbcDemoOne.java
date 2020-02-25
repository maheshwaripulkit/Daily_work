package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoOne {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection con = DriverManager.getConnection(url, "root", "root");
		//String query = "insert into user values(1,'Pulkit','Agra',9827211456)";
		// String query="create table user"+"(userid int primary key,"+"username
		// varchar(200),"+"city varchar(200),"+"mobilenumber long)";
		//String query="alter table user add pincode int";
		String query="update user set pincode=466116 where usid=1";
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate(query);
		
//		if(result>0)
//		{
//			System.out.println("table created successfully");
//		}
//		else
//		{
//			System.out.println("table not created");
//		}

	}

}
