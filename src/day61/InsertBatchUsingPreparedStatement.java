package day61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertBatchUsingPreparedStatement {

	public static void main(String[] args)  throws Exception
	{
		Connection connection=MySQLDBConnectionUpgradB13.getDBConnection();
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Emps to Add");
		int size=sc.nextInt();
		
		String query="insert into emp4(ename,salary) values(?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		
		
		for(int i=1;i<=size;i++)
		{
		System.out.println("Enter Emp name");
		String ename=sc.next();
		
		System.out.println("Enter Emp Salary");
		Double sal=sc.nextDouble();
		
		
		
		ps.setString(1, ename);
		ps.setDouble(2, sal);
		
		ps.addBatch();
		}
		
		int rows[]=ps.executeBatch();		//	0		1		2		3				..			9
											//  1       1       1       1                           1
		if(rows.length>0)
		System.out.println(rows.length +" records Inserted");
		
		ps.close();
		connection.close();

	}

}
