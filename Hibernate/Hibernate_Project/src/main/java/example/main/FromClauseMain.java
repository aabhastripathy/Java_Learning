package example.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.entity.Exam;
import example.utils.HibernateUtils;

public class FromClauseMain {

	public static void main(String[] args) {
		// This class loads all the records all the data from Exam_Master table and displays them
		try(
				SessionFactory factory = HibernateUtils.getSssionFactory();
				Session sessionObj = factory.openSession();
				
				){
			String hqlQuery = "From Exam ex";
			Query<Exam> queryRef = sessionObj.createQuery(hqlQuery, Exam.class);
			 List<Exam> examList = queryRef.getResultList();
			 for(Exam e : examList) {
				 System.out.println(e);
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
