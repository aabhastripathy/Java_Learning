
public class StudentMANAGEMENTapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s = new Student("Amit", 10.25f);

Student s1 = new Student( "Junaid", 98.25f);
//s.rollNumber = 01;
//s.name = "Aabhas";
//s.marks = 98.65f;
//s.accept(7, "Amit", 10.25f);
//s1.accept(2, "Junaid", 98.25f);
s.display("=");
s1.display("=");
System.out.println(s.countStudent());
	}

}
