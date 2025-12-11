package practice.jdbc.employee;

import java.util.Collection;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DaoInterface<Employee,Integer> inte_ref=new EmployeeDao();
Collection<Employee> Labour = inte_ref.getAll();
for(Employee e : Labour)
	System.out.println(e);
	}

}
