package day61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args)  throws Exception
	{
		Connection con=MySQLDBConnectionUpgradB13.getDBConnection();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Emp number whose record you wish to delete ");
		int employeeNumber=sc.nextInt();
		
		String query1="delete from emp4 where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query1);
		ps.setInt(1, employeeNumber);
		
	
		int rows=ps.executeUpdate();			//0			1		2		3		4
												//1         1       1       1       1
		if(rows>0)
		System.out.println(rows +" records Deleted");
		
		ps.close();
		con.close();

	}

}
