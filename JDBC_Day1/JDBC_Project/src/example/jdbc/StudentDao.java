package example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class StudentDao implements DaoInterface<Student,Integer> {
	@Override
	public Collection <Student> getAll(){
//		this method retries all the records from student table ,
//		Converts them into java objects of Student class and returns 
//		all those objects as collection
		
		Collection<Student> allStudents = new ArrayList<>();
		String sqlQuery = "Select student_name,student_city,student_id From students";
		try(Connection dbConnection = JdbcUtils.getConnection();
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery)){
			while(rs.next()) {
				String name = rs.getString(1);//Column index 
				String city = rs.getString(2);
				int ID = rs.getInt(3);
				Student studentObj = new Student(ID, name ,city);
				allStudents.add(studentObj);
				}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return allStudents;
	}
	

}
