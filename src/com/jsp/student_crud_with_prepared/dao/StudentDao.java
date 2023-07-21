package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.connection.StudentConnection;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentDao {
	Connection connection=StudentConnection.getStudentConnection();
	
/*
 * insert method for student
 */
	
	public Student insertstudent(Student student) {
		
	String insertQuery="insert into student values(?,?,?,?)";
	
	try {
	 
	 PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
	 
	 
	 preparedStatement.setInt(1, student.getStudentId());
	 preparedStatement.setString(2, student.getStudentName());
	 preparedStatement.setString(3, student.getStudentEmail());
	 preparedStatement.setLong(4, student.getStudentPhone());
	 
	 
	 
	 preparedStatement.execute();
	 
	 return student;
	 
	 
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return null;
		
	}/* method insert end*/
	/*
	 * update student data method
	 */
	
	public int updateStudentName(int studentId, String studentName) {
		String updateStudentNameQuery="update student set name=? where studentid=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateStudentNameQuery);
			preparedStatement.setInt(2, studentId);
			preparedStatement.setString(1,studentName);
			
			return preparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateStudentEmail(int studentId, String studentEmail) {
		String updateStudentEmailQuery="update student set email=? where studentid=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateStudentEmailQuery);
			preparedStatement.setInt(2, studentId);
			preparedStatement.setString(1,studentEmail);
			return preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateStudentPhone(int studentId, long studentPhone) {
		String updateStudentPhoneQuery="update student set phone=? where studentid=?";
		try {
		    PreparedStatement preparedStatement=connection.prepareStatement(updateStudentPhoneQuery);
		    preparedStatement.setInt(2, studentId);
		    preparedStatement.setLong(1, studentPhone);
		    return preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public void displayStudentDetail()
	{
		String displayStudentQuery="select * from student";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(displayStudentQuery);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			
			int id=resultSet.getInt("studentid");
			String name=resultSet.getString("name");
			String email=resultSet.getString("email");
			long phone=resultSet.getLong("phone");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

