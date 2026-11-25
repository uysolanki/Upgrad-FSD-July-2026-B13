package day61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBatchUsingStatement {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");    //8.0.33 "com.mysql.cj.jdbc.Driver"
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb13db", "root", ""
		);
		

		
		String query1="insert into emp4(ename,salary) values('Chris',1200.0)";
		String query2="insert into emp4(ename,salary) values('David',1100.0)";
		String query3="insert into emp4(ename,salary) values('Elcid',850.0)";
		String query4="insert into emp4(ename,salary) values('Frank',1000.0)";
		String query5="insert into emp4(ename,salary) values('George',900.0)";
		
		
		Statement st=connection.createStatement();
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		st.addBatch(query5);
		
		int rows[]=st.executeBatch();			//0			1		2		3		4
												//1         1       1       1       1
		if(rows.length>0)
		System.out.println(rows.length +" records Inserted");
		
		st.close();
		connection.close();

	}

}
