
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
	System.out.println(name);
	System.out.println(basicSal);
	System.out.println(hours);
	System.out.println(rate);
	
}
}
