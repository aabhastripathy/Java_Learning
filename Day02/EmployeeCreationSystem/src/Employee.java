
public class Employee {
private int id;
private String name;
private double basicSalary;
private static int idGen= 0;

public Employee(String name,double basicSalary) {
	this.id = ++idGen;
	this.name = name;
	this.basicSalary = basicSalary;
}

void showDetails() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(basicSalary);
}
void calculateSal() {
	System.out.println(basicSalary * 2);
}
}
