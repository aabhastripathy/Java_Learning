import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		Employee emp = null;
		// TODO Auto-generated method stub
		do {
			System.out.println("Welcome To Employee Management System");
			System.out.println("=======================================");
			System.out.println("1.Register New Employee");
			System.out.println("2.Display Details");
			System.out.println("-1.Exit");
			System.out.println("Enter choice : ");
			num=sc.nextInt();
			
			

			switch(num){
				case 1:
					 emp = new Employee("Amit",890.56);
					break;
				case 2 :
					 if (emp != null) {
	                        emp.showDetails();
	                    } 
					 else 
					 {
	                        System.out.println("No employee registered yet!");
	                    }
	                    break;
				case -1:
					System.out.println("Exiting....");
					break;
	                    
				default :
					System.out.println("Wrong Value");
			
			}
			
		}while(num>0);
//		Employee emp = new Employee("Amit",890.56);
//		emp.showDetails();
//		emp.calculateSal();

	}

}
