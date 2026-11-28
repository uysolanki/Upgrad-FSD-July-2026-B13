package day61;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectUsingPreparedStatement {
public static void main(String[] args) throws Exception 
{
	
	Connection connection=MySQLDBConnectionUpgradB13.getDBConnection();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter base salary ");
	double  baseSalary=sc.nextDouble();
	
	String query="select * from emp4 where salary<=?";
	
	PreparedStatement ps=connection.prepareStatement(query);
	ps.setDouble(1, baseSalary);
	
	ResultSet rs=ps.executeQuery();
	
	System.out.println(String.format("%-10s%-15s", "Emp Name" , "Emp Salary"));
	System.out.println(String.format("--------  ----------"));
	while(rs.next())
	{
		System.out.println(String.format("%-10s%.2f", rs.getString("ename") , rs.getDouble("salary")));
	}
	
	rs.close();
	ps.close();
	connection.close();
	
}
}

// 1      2       <--  col index
//ename  salary   <--- col name 
//Alice     700    
//Ben       800   
//Elcid     850 
//George    900   <-- rs 