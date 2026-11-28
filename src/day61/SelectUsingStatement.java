package day61;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement {
public static void main(String[] args) throws Exception 
{
	
	Connection connection=MySQLDBConnectionUpgradB13.getDBConnection();
	
	String query="select ename,salary from emp4 where eno=4";
	
	Statement st=connection.createStatement();
	
	ResultSet rs=st.executeQuery(query);
	
	if(rs.next())
	{
		System.out.println(rs.getString(1)+ "," + rs.getDouble(2));
	}
	
	rs.close();
	st.close();
	connection.close();
	
}
}

// 1      2
//ename  salary   
//David  1200   <--- rs