package example.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Department;
import example.utils.HibernateUtils;

public class AddDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory factory = HibernateUtils.getSssionFactory();
				Session sessionObj = factory.openSession()
				){
			Department d1 = new Department(101,"IT","Pune",null);
			Department d2 = new Department(102,"HR","Mumbai",null);
					Transaction tx = sessionObj.beginTransaction();
					sessionObj.persist(d1);
					sessionObj.persist(d2);
					
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


