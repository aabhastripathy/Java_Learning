package example.jdbc;

public class DataUpdationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoInterface<Student, Integer> daoRef = new StudentDao();
		Student foundStudent = daoRef.getOne(4);
		if(foundStudent != null) {
			foundStudent.setName("Arsalan");
			foundStudent.setCity("Bombay");
			daoRef.update(foundStudent);
		}
		else
			System.out.println("Student not found ");
	}

}
