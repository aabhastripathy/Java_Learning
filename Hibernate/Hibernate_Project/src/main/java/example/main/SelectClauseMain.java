package example.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.utils.HibernateUtils;

public class SelectClauseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(
		SessionFactory factory = HibernateUtils.getSssionFactory();
		Session sessionObj = factory.openSession();
		
		){
	String hqlQuery = "Select ex.name,ex.duration From Exam ex";
	Query<Object[]> queryRef =  sessionObj.createQuery(hqlQuery, Object[].class);
	List<Object[]> dataList = queryRef.getResultList();
	
	for(Object[] d: dataList) {
		Object name = d[0];
		Object dur = d[1];
		
		System.out.println("Name: " + name +" Duration: "+ dur);
	}
	
	
	
} catch (HibernateException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
