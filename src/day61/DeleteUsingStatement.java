package day61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");    //8.0.33 "com.mysql.cj.jdbc.Driver"
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb13db", "root", ""
		);
		

		
		String query1="delete from emp4 where eno=7";
		
		
		Statement st=connection.createStatement();
		
		
		
		int rows=st.executeUpdate(query1);			//0			1		2		3		4
												//1         1       1       1       1
		if(rows>0)
		System.out.println(rows +" records Deleted");
		
		st.close();
		connection.close();

	}

}
