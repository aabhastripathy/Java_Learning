package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
public static Connection getConnection() throws SQLException {
	//this method is used for establishing Connection with DB and returns the same 
	String connectionURL = "jdbc:mysql://localhost:3306/cdac?useSSL = false";//<-connection url constant for all mysql connection
	String userId = "root";
	String password = "08520";
	Connection dbConnection = DriverManager.getConnection(connectionURL, userId, password);
	
	return dbConnection;
}
}
