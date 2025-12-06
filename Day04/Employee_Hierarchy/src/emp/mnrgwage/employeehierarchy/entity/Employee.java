package emp.mnrgwage.employeehierarchy.entity;

public abstract class Employee {
	protected int basicSal;
	protected String name;
	public Employee(int basicSal,String name) {
		this.basicSal = basicSal;
		this.name =name;
	}
public abstract int calculateSal() ;
public void showDetails() {
	System.out.println(name);
	System.out.println(basicSal);
}
}
