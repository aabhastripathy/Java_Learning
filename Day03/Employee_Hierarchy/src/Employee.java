
public class Employee {
	protected int basicSal;
	protected String name;
	public Employee(int basicSal,String name) {
		this.basicSal = basicSal;
		this.name =name;
	}
public int calculateSal() {
	return basicSal;
}
public void showDetails() {
	System.out.println(name);
	System.out.println(basicSal);
}
}
