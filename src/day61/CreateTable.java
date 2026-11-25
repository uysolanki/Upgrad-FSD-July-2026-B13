package day61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");    //8.0.33 "com.mysql.cj.jdbc.Driver"
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb13db", "root", ""
		);
		
		//System.out.println(connection.isClosed());
		
//		String query="create table emp3(\r\n"
//				+ "eno int auto_increment,\r\n"
//				+ "ename varchar(20) not null,\r\n"
//				+ "salary double,\r\n"
//				+ "primary key(eno))";
		
		
		String query="create table emp4(eno int auto_increment,ename varchar(20) not null,salary double,primary key(eno))";
		
		
		Statement st=connection.createStatement();
		
		st.execute(query);
		
		System.out.println("Table created");
		
		st.close();
		connection.close();

	}

}
