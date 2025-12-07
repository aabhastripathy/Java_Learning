import java.util.Scanner;

public class StudentMANAGEMENTapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stud1 = null;
		Student [] students = new Student(2);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int count =0;
		do {
		
			 System.out.println("Welcome to Student Management System");
			 System.out.println("======================================");
			 System.out.println("1. Register New Student");
			 System.out.println("2. Display Details");
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
			 	case -1:
			 		System.out.println("Thank You");
			 }
			
		}while(choice!=-1);
	}

}
