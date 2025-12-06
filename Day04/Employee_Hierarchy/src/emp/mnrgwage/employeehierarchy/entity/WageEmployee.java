package emp.mnrgwage.employeehierarchy.entity;

public class WageEmployee extends Employee {
	private int hours;
	private int rate;
public WageEmployee(String name , int basicSal,int hours,int rate) {
	super(basicSal,name);
	this.hours=hours;
	this.rate=rate;
}
@Override
public int calculateSal() {
	return basicSal + (hours*rate);
}
@Override
public void showDetails() {
	super.showDetails();
	System.out.println(hours);
	System.out.println(rate);
	
}
}
