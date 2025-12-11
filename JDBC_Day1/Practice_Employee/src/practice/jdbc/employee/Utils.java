package practice.jdbc.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
public static Connection getConnection() throws SQLException {
	String URL = "jdbc:mysql://localhost:3306/cdac?useSSL = false";//<-connection url constant for all mysql connection
	String uId = "root";
	String pwd = "08520";
	Connection dbConnection = DriverManager.getConnection(URL, uId, pwd);
	
	return dbConnection;
}
}
