package com.jsp.student_crud_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {
     public static Connection getStudentConnection() {
    	 
    	
    	 //step 1 load or register driver
    	 
    	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 create connection
			
			String url="jdbc:mysql://localhost:3306/jdbc-preparedStatement";
			String user="root";
			String pass="tiger";
			
			Connection connection= DriverManager.getConnection(url, user, pass);
			
			return connection;
						
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return null;
     }
}
