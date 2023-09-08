package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmp {
	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		
		Connection connection= null;
		try {
			
		//STEP1: LOAD/REGISTER THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//STEP2: ESTABLISH THE CONNECTION
			connection=DriverManager.getConnection(url, username, password);
			
		//STEP3:CREATE STATEMENT
			Statement statement = connection.createStatement();
			
		//STEP4:EXECUTE STATEMENT
			int a= statement.executeUpdate("UPDATE employee set name='ddd',email='ddd@gmail.com' WHERE id=1 ");
			if(a>0) {
				System.out.println("Employee data updated");
			}else {
				System.out.println("Employee not updated");
			}
			System.out.println("data inserted!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				
			//STEP5: CONNECTION CLOSE
				connection.close();
				System.out.println("Connection closed!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


}
