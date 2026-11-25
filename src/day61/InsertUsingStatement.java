package day61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");    //8.0.33 "com.mysql.cj.jdbc.Driver"
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb13db", "root", ""
		);
		

		
		String query="insert into emp4(ename,salary) values('Ben',800.0)";
		
		
		Statement st=connection.createStatement();
		
		int rows=st.executeUpdate(query);
		
		if(rows>0)
		System.out.println(rows +" records Inserted");
		
		st.close();
		connection.close();

	}

}
