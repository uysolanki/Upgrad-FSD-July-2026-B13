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


//
//student name         product percentage
//--------------------98.600000											"%20s%f"
//Akshata-------------											("%-20s%.2fs","Akshata",98.6)
//-------------Akshata                                            "%20s"