package org.ycpait.studentmanagementapp.entity;
import java.util.HashSet;
import java.util.Set;

public class DemoHashCodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Student> students = new HashSet<Student>();
Student s1 = new Student("Amit",88);
Student s2 = new Student("Namit",75);

System.out.println(students.size());

	}

}
