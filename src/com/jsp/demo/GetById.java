package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetById {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		Connection connection=null;
		//1: load/ register the driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(url, username, password);
			
			Statement statement= connection.createStatement();
			
			ResultSet resultSet =statement.executeQuery("Select * from employee WHERE id=102");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				
				System.out.println("===========================");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
		
	}

}
