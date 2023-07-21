package com.jsp.student_crud_with_prepared.service;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentService {
	
	 StudentDao studentDao= new StudentDao();
	 /*
	  * insert method for student
	  */

	 public Student insertStudentService(Student student)
	 {
		 System.out.println("insert method start");
		 
		 if(student.getStudentId()<9999)
		 {
			 Student student2=studentDao.insertstudent(student);
			 System.out.println("insert method stop");
			 return student2;
		 }
		 else {
			 System.err.println("id in not biger then 4digit");
		 }
		 return null;
	 }/*
	 *update student name data method
	 */
	 
		public int updateStudentName(int studentId, String studentName) {
			return studentDao.updateStudentName(studentId, studentName);
			
		}
		/*
		 * update email
		 */
		public int updateStudentEmailService(int studentid, String studentEmail) {
			return studentDao.updateStudentEmail(studentid, studentEmail);
		}
		/*
		 * update phone
		 */
		public int updateStudentphoneService(int studentId, long studentphoneno) {
			return studentDao.updateStudentPhone(studentId, studentphoneno);
		}
		public void displayStudentService() {
			studentDao.displayStudentDetail();
		}
	}
