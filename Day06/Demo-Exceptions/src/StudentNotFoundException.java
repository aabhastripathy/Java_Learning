import java.util.Scanner;

public class StudentNotFoundException extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Roll Number :");
int r = sc.nextInt();
if (r != 1) {
	StudentNotFoundException e = new StudentNotFoundException();
	//throw e;
}
	}

}
