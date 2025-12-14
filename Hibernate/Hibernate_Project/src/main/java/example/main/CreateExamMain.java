package example.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Exam;
import example.utils.HibernateUtils;

public class CreateExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(
		SessionFactory factory = HibernateUtils.getSssionFactory();
		Session sessionObj = factory.openSession()
		){
	Exam examObj = new Exam("E03","ADV Java","Lab",60);
	Transaction tx = sessionObj.beginTransaction();
	sessionObj.persist(examObj);
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
