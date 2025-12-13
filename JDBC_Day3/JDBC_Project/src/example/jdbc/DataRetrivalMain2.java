package example.jdbc;

import java.util.Collection;

public class DataRetrivalMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DaoInterface<Student, Integer> daoRef = new StudentDao();
Collection<Student>allStudents = daoRef.getAll();
for(Student st: allStudents)
	System.out.println(st);


System.out.println("===============================================");

Student std = daoRef.getOne(01);
if(std != null)
	System.out.println(std);
else
	System.out.println("Student does not exist");
}


}
