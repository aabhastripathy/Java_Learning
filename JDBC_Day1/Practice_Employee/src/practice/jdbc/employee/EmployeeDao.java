package practice.jdbc.employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class EmployeeDao implements DaoInterface<Employee,Integer> {
	@Override
	public Collection<Employee> getAll(){
		Collection<Employee>Labour = new ArrayList<Employee>();
		String Query = "Select empno,ename,deptno From employee";
		try {
			Connection dbConnection = Utils.getConnection();
			Statement stm = dbConnection.createStatement();
			ResultSet result = stm.executeQuery(Query);
			while(result.next()) {
				int empno = result.getInt(1);
				String ename =result.getString(2);
				int deptno = result.getInt(3);
				Employee e = new Employee(empno,deptno,ename);
				Labour.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Labour;
		
	}

}
