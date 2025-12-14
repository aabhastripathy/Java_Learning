package example.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Employee;
import example.utils.HibernateUtils;

public class AddEmployeesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(
		SessionFactory factory = HibernateUtils.getSssionFactory();
		Session sessionObj = factory.openSession()
		){
			Employee e1 = new Employee(101,"Arun",2000);
			Employee e2 = new Employee(102,"Ali",12000);
			Employee e3 = new Employee(103,"Kirun",52000);
			Employee e4 = new Employee(104,"Thomas",8000);
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(e1);
			sessionObj.persist(e2);
			sessionObj.persist(e3);
			sessionObj.persist(e4);
			tx.commit();
			System.out.println("TRANSCTION DONE");
			
	
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
