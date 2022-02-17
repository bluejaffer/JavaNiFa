package com.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskConnection {
		static	Connection connection;
		public static void main(String[] args){
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
			    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "nifa");
				
			    String sql = "Select * from EMPLOYEES";
				
				PreparedStatement prepareStatement = connection.prepareStatement(sql);
				
				ResultSet executeQuery = prepareStatement.executeQuery();
				
				while (executeQuery.next()) {
					String string = executeQuery.getString("last_name");
					System.out.println(string);	
				}
				try {	
				}
				finally {
					connection.close();
				}
			} 
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}


