package day61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args)  throws Exception
	{
		
		Connection connection = MySQLDBConnectionUpgradB13.getDBConnection();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Emp number whose salary you wish to update ");
		int employeeNumber=sc.nextInt();
		
		System.out.println("Enter the Salary Hike amount");
		Double incrementAmount=sc.nextDouble();
		
		String query1="update emp4 set salary=salary+? where eno=?";
		
		PreparedStatement ps=connection.prepareStatement(query1);
		
		ps.setDouble(1, incrementAmount);
		ps.setInt(2, employeeNumber);
		
		
		int rows=ps.executeUpdate();			//0			1		2		3		4
												//1         1       1       1       1
		if(rows>0)
		System.out.println(rows +" records Updated");
		
		ps.close();
		connection.close();

	}

}
