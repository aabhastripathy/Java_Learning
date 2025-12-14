package example.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.entity.Exam;
import example.utils.HibernateUtils;

public class RetriveExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//this class is used to fetch single Exam record based on id
		try(
				SessionFactory factory = HibernateUtils.getSssionFactory();
				Session sessionObj = factory.openSession()
				){
			Class<Exam> examClassType = Exam.class;
			Object examCode = "E02";
			Exam foundExam =sessionObj.find(examClassType, examCode);
			System.out.println(foundExam);
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
