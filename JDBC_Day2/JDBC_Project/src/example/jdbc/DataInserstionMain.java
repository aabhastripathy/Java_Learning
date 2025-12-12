package example.jdbc;

public class DataInserstionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoInterface<Student, Integer> daoRef = new StudentDao();
		Student std = new Student(104,"xty","gfr");
		daoRef.create(std);
	}

}
