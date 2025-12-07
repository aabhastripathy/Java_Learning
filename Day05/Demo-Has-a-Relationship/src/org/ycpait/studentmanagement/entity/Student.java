
package org.ycpait.studentmanagement.entity;

public class Student {
private int rollNumber;

//has - a - realationship   
private Address postalAddress;


private Trainner Instructor;

public Student(int rollNumber,Address postalAddress) {
	this.rollNumber = rollNumber;
	this.postalAddress = postalAddress;
}
public Trainner getInstructor() {
	return Instructor;
}
public void getInstructor()
}
