package practice.jdbc.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//STEP 1: LOAD DRIVER 
	
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("LOADED");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//STEP 2 : ESTABLISH CONNECTION
String connectionURL = "jdbc:mysql://localhost:3306/cdac?useSSL = false";
String userID = "root";
String password = "08520";
Connection connectionDb = null;
Statement stm = null;
ResultSet result = null;

try {
	connectionDb = DriverManager.getConnection(connectionURL,userID,password);
	System.out.println("CONNECTED");
	
	//STEP 3:OBTAIN A STATEMENT 
	stm = connectionDb.createStatement();
	
	//STEP 4:EXECUTE THE QUERY 
	String Query = "Select empno,ename,deptno From employee";
	
	
	result = stm.executeQuery(Query);
	while(result.next()) {
		int empno = result.getInt(1);
		String ename = result.getString(2);
		int deptno = result.getInt(3);
		System.out.println(empno + " , "+ ename + " , " + deptno);
		
	}
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


finally {
	try {
		result.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		stm.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		connectionDb.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


	}

}
