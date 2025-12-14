package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.entity.Project;

public class CreateProjectMain {

	public static void main(String[] args) {
		// Configure Hibernate 
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		
		//Obtain SessionFactory
		SessionFactory factory = null;
		Session sessionobj = null;
		
		
		try {
		factory = cfg.buildSessionFactory();
		
		//Open Session
		sessionobj =  factory.openSession();
		
		// Create object of entity class
		
		Project myProject = new Project(101,"Banking Sys","Java",15);
		
		
		//Obtain Transaction
		Transaction tx = sessionobj.beginTransaction();
		
		//Store Data into DB
		sessionobj.persist(myProject);
		
		//Commit the transaction
		tx.commit();
		
		//Close the Session And SessionFactory
		sessionobj.close();
		factory.close();
		System.out.println("TRANSACTION DONE");
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
