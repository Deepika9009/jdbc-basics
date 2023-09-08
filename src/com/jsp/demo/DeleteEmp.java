package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmp {

	public static void main(String[] args) {

		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username= "root";
		String password="root";
		Connection connection=null;
		//1: load/register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//2: get connection
			connection=DriverManager.getConnection(url, username, password);
			
		//3: create statement
			Statement statement=connection.createStatement();
			
		//4: execute statement
			statement.execute("DELETE FROM employee WHERE Id=103");
			
			System.out.println("Data deleted successfully!!");
			
		//5:to close connection
			connection.close();
			System.out.println("connection closed");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
