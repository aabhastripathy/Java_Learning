package org.ycpait.studentmanagementapp.entity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.ycpait.studentmanagementapp.exception.StudentNotFoundException;
public class StudentMANAGEMENTapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stud1 = null;
		//Student[] students = new Student[2];
		List<Student> students = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int count =0;
		do {
		
			 System.out.println("Welcome to Student Management System");
			 System.out.println("======================================");
			 System.out.println("1. Register New Student");
			 System.out.println("2. Display Details");
			 System.out.println("3. Search Student By Roll Number");
			 System.out.println("4. Delete Student By Roll Number");
			 System.out.println("-1. Exit");
			 System.out.println("Enter your choice");
			 choice = sc.nextInt();
			 switch(choice) {
			 	case 1: 
			 		System.out.println("Enter Name");
			 		String name = sc.next();
			 		System.out.println("Enter Marks");
			 		Float marks = sc.nextFloat();
			 		Student s = new Student(name,marks);
			 		students.add(s);
			 		break;
			 	case 2:
			 		if(students!=null)
//			 			stud1.display();
			 			System.out.println(students.toString());
			 		break;
			 	case 3 :
			 		System.out.println("Enter the Roll Number");
			 		int r = sc.nextInt();
			 		boolean isFound = false;
			 		for(Student foundStudent : students) {
			 			if(foundStudent != null) {
			 				if(foundStudent.getRollNumber() == r ) {
			 					System.out.println(foundStudent);
			 					isFound = true;
			 					break;
			 				}
			 			}
			 			
			 		}
			 		if(!isFound) {
			 			
				 			try{
				 				StudentNotFoundException e = new StudentNotFoundException();
				 				throw e;
				 			}
				 			catch(StudentNotFoundException ex) {
				 				System.out.println("404 NOT FOUND!!");
				 			}
				 		
			 		}
			 	
			 	case 4 :
			 		System.out.println("Enter Roll Number to Delete");
			 		int RNO = sc.nextInt();
			 		Iterator<Student> i= students.iterator(); ;
			 		while(i.hasNext()) {
			 			Student studentToBeDeleted = i.next();
			 			if(studentToBeDeleted.getRollNumber() == RNO) {
			 				i.remove();
			 			}
			 		}
			 		
			 	case -1:
			 		System.out.println("Thank You");
			 }
			
		}while(choice!=-1);
	}

}
