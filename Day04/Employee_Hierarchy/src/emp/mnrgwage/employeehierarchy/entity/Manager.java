package emp.mnrgwage.employeehierarchy.entity;

public class Manager extends Employee{
	private int incentives;
	public Manager(int incentives,int basicSal,String name) {
		super(basicSal,name);
		this.incentives = incentives;
	}
	@Override
	public int calculateSal() {
		return basicSal + incentives;
	}
	@Override
	public void showDetails() {
		super.showDetails();;
		System.out.println(incentives);
		
	}
}
