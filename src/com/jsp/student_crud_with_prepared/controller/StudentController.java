package com.jsp.student_crud_with_prepared.controller;

import java.util.Scanner;

import com.jsp.student_crud_with_prepared.dto.Student;
import com.jsp.student_crud_with_prepared.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("main method start");
		Student student=null;
		System.out.println("main end");
		
		
         System.out.println("1. Insert\n 2.update\n 3.display");
         System.out.println("enter the option");
         int ch=scanner.nextInt();
         StudentService ss=new StudentService();
         
         switch(ch) {
         
         case 1: {
        	 System.out.println("enter id");
        	 int id =scanner.nextInt();
        	 System.out.println("enter name");
        	String name=scanner.next();
        	System.out.println("enetr email");
        	String email=scanner.next();
        	System.out.println("enter phone");
        	long phone=scanner.nextLong();
        	
        	student= new Student(id, name, email, phone);
        	ss.insertStudentService(student);
         }
         break;
         
         case 2: {System.out.println("choose option to update");
        	 	System.out.println("1.Name\n2.Email\n3.phone");
        	 	int x=scanner.nextInt();
        	 	switch(x) {
        	 	case 1:{
        	 		/*
        	 		 * update student name
        	 		 */
        	 	    
                	
          	 		
              	     System.out.println("enter id");
           	    int id =scanner.nextInt();
               	 System.out.println("enter name");
               	String name=scanner.next();
                int id1=ss.updateStudentName(id, name);
         	   if(id1==1) {
         		System.out.println("data updated");
         	 }
          	 else {
         		System.out.println("id is miss match");
         	}
         	   }
        	 	break;
        	 	/*
        	 	 * update student email
        	 	 */
        	 	case 2:{
        	 		System.out.println("enter id");
        	 		int id=scanner.nextInt();
        	 		System.out.println("enter email");
        	 		String email=scanner.next();
        	 		int id2=ss.updateStudentEmailService(id, email);
        	 		if(id2==1) {
        	 			System.out.println("email update");
        	 		}
        	 		else {
        	 			System.out.println("id not found");
        	 		}
        	 	}
        	 	break;
        	 	/*
        	 	 * update phone no
        	 	 */
        	 	case 3:{System.out.println("enter id");
        	 	int id=scanner.nextInt();
        	 	System.out.println("enter phone no");
        	 	long phoneno=scanner.nextLong();
        	 	int id3=ss.updateStudentphoneService(id, phoneno);
        	 	if(id3==1) {
        	 		System.out.println("phone no update");
        	 	}
        	 	else {
        	 		System.out.println("id not found");
        	 	}
        	 		
        	 	}
        	 	break;
        	 	}
        	 	}
         case 3:{
        	 ss.displayStudentService();
         }
         break;
         }
        
	}}
		
	


