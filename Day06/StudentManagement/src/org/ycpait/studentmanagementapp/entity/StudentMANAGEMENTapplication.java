package org.ycpait.studentmanagementapp.entity;
import java.util.Scanner;

import org.ycpait.studentmanagementapp.exception.StudentNotFoundException;
public class StudentMANAGEMENTapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stud1 = null;
		Student[] students = new Student[2];
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int count =0;
		do {
		
			 System.out.println("Welcome to Student Management System");
			 System.out.println("======================================");
			 System.out.println("1. Register New Student");
			 System.out.println("2. Display Details");
			 System.out.println("3. Search Student By Roll Number");
			 System.out.println("-1. Exit");
			 System.out.println("Enter your choice");
			 choice = sc.nextInt();
			 switch(choice) {
			 	case 1: 
			 		count++;
				 	System.out.println("Case 1");
				 	students[count] = new Student("Bob",60000);

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
			 		
			 	case -1:
			 		System.out.println("Thank You");
			 }
			
		}while(choice!=-1);
	}

}
