package day61;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDBConnectionUpgradB13 {

	
	public static Connection getDBConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");    //8.0.33 "com.mysql.cj.jdbc.Driver"
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb13db", "root", ""
		);
		return connection;
	}
}
