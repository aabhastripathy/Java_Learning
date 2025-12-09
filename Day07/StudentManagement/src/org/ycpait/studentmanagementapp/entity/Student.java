package org.ycpait.studentmanagementapp.entity;

public class Student implements Compareable<Student> {
//attributes or instances 
	private int rollNumber;
	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	private String name;
	private float marks;
	private static int rollNumbergen = 0;
	
	void accept(int rollNumber,String name , float marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	
	
//	void display() {
//		System.out.println(this.rollNumber);
//		System.out.println(this.name);
//		System.out.println(this.marks);
//	}
////public Student() {
//	this.rollNumber = 1;
//	this.name = "Admin";
//	this.marks = 100;
//}

public Student(String name , float marks) {
	this.rollNumber = ++rollNumbergen;
	this.name = name;
	this.marks = marks;
}
void display(String format) {
	System.out.println("Roll_Number \t Name \t Marks");
	for(int i = 0;i<=50;i++) {
		System.out.print(format);
	}
	System.out.println();
	System.out.println(this.rollNumber + "\t\t" + this.name + "\t\t" + this.marks);
}
public int countStudent() {
	return rollNumbergen;
}


@Override
public String toString() {
	return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
}

}
