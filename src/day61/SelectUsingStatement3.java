package day61;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement3 {
public static void main(String[] args) throws Exception 
{
	
	Connection connection=MySQLDBConnectionUpgradB13.getDBConnection();
	
	String query="select * from emp4 where salary<1000";
	
	Statement st=connection.createStatement();
	
	ResultSet rs=st.executeQuery(query);
	
	System.out.println(String.format("%-10s%-15s", "Emp Name" , "Emp Salary"));
	System.out.println(String.format("--------  ----------"));
	while(rs.next())
	{
		System.out.println(String.format("%-10s%.2f", rs.getString("ename") , rs.getDouble("salary")));
	}
	
	rs.close();
	st.close();
	connection.close();
	
}
}

// 1      2       <--  col index
//ename  salary   <--- col name 
//Alice     700    
//Ben       800   
//Elcid     850 
//George    900   <-- rs 