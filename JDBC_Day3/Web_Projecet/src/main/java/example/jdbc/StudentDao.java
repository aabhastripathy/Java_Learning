package example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

	
	
	//new
	@Override
	public Student getOne(Integer id) {
		// This method accepts an Integer value indicating Student ID and return object matching with that ID , null for non  ID
		
		Student foundStudent = null;
		String Query = "Select student_id, student_name, student_city from students where student_id = ?";
		
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement psmt = dbConnection.prepareStatement(Query);
				){
			psmt.setInt(1,id);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString(2);//Column index 
				String city = rs.getString(3);
				int ID = rs.getInt(1);
				foundStudent = new Student(ID,name,city);
			}
			
			
		} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return foundStudent;
	}



	@Override
	public void create(Student studentobj) {
String Query = "insert into students values(?,?,?)";
		
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement psmt = dbConnection.prepareStatement(Query);
				){
					int id = studentobj.getStudentid();
					String name = studentobj.getName();
					String city = studentobj.getCity();
					
					psmt.setInt(1, id);
					psmt.setString(3, city);
					psmt.setString(2, name);
					int count = psmt.executeUpdate();
					System.out.println("Recored Inserted");
					
					
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	

	
	
	}



	@Override
	public void update(Student modifiedStudentobj) {
		// This method receives modified state of Student object and reflects that back to DB  
		String Query = "Update students set student_name = ?,student_city = ? where student_id = ? ";
		
		
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement psmt = dbConnection.prepareStatement(Query);
				){
					int id = modifiedStudentobj.getStudentid();
					String name = modifiedStudentobj.getName();
					String city = modifiedStudentobj.getCity();
					
					psmt.setInt(3, id);
					psmt.setString(2, city);
					psmt.setString(1, name);
					
					
					int count = psmt.executeUpdate();
					System.out.println("Updated");
					
					
					
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}



	@Override
	public void deleteOne(Integer id) {
		// This method accepts id of the student and deletes the relevant record
		String Query ="Delete From students where student_id = ?";
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement psmt = dbConnection.prepareStatement(Query);
				){
			psmt.setInt(1, id);
			
			int count = psmt.executeUpdate();
			if(count != 0) {
				System.out.println(count + "Deleted");
			}
			else
				System.out.println("Student not found");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}



	
}
