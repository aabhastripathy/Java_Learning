package example.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Department;
import example.entity.Employee;
import example.utils.HibernateUtils;

public class LinkEmployeeToDept {//this class loads all Employees and departments link them 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(
				SessionFactory factory = HibernateUtils.getSssionFactory();
				Session sessionObj = factory.openSession()
				){
			
			//loading all employees
			Employee emp1 = sessionObj.find(Employee.class, 101);
			Employee emp2 = sessionObj.find(Employee.class, 102);
			Employee emp3 = sessionObj.find(Employee.class, 103);
			Employee emp4 = sessionObj.find(Employee.class, 104);
			
			
			//loading all the departments
			Department dept1 = sessionObj.find(Department.class, 101);
			Department dept2 = sessionObj.find(Department.class, 102);
			
			Transaction tx = sessionObj.beginTransaction();
			//making a list of employees we can add employees one by one as well for that we created an addEmployee() method in employee class 
			List<Employee> empList = List.of(emp1,emp2);
			//Adding 2 employees at once making a list
			dept1.setEmployeelist(empList);
			
			//Adding employees one by one using addEmployee()
			dept2.addEmployee(emp3);
			dept2.addEmployee(emp4);
			tx.commit();
			System.out.println("TRANSACTION DONE");
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
