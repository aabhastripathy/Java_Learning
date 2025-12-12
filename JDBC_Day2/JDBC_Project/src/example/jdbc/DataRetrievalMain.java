package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRetrievalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to retrieve data from DB using Select Query and display it
		
		
		//STEP 1: LOAD THE DRIVER
		String driverClass = "com.mysql.cj.jdbc.Driver";//<-write this to load the driver
		try {
			Class.forName(driverClass);//<-write this to load the driver
			System.out.println("Driver Loaded.");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		//STEP 2: ESTABLISH CONNECTION
		String connectionURL = "jdbc:mysql://localhost:3306/cdac?useSSL = false";//<-connection url constant for all mysql connection
		String userId = "root";
		String password = "08520";
		Connection dbConnection = null;//Declare variable of type Connection 
		Statement stmt = null;//Declare variable of type Statement 
		ResultSet rs = null;//Declare variable of type ResultSet 
		try {
			dbConnection = DriverManager.getConnection(connectionURL, userId, password);//store your userId,connection url & password and pass them in variable of type connection via DriverManager.getConnection() method
			System.out.println("Connected to DB");
			
			
			
			//STEP 3: OBTAIN SOME STATEMENT
			stmt = dbConnection.createStatement();
			
			
			
			//STEP 4: EXECUTE THE QUERY
			String sqlQuery = "Select student_name,student_city,student_id From students";
			
			
			
			
			//STEP5: OBTAIN RESULTSET PERFORMING NAVIGATION ON RESULTSET
			rs = stmt.executeQuery(sqlQuery);//for storing query result (only applicable for select as only select returns data )
			while(rs.next()) {
			String name = rs.getString(1);//Column index 
			String city = rs.getString(2);
			String ID = rs.getString(3);
			System.out.println(ID + ", " + name + " , " + city );
			}
			
			} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
			rs.close();
			stmt.close();
			dbConnection.close();
			
		}catch (SQLException e) {
			
			e.printStackTrace();
			}

	}

}
}
