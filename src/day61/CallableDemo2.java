package day61;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CallableDemo2 {

	public static void main(String[] args) throws Exception
	{
		Connection con = MySQLDBConnectionUpgradB13.getDBConnection();
		
		int a=45;
		String b ="Rohit";
		int c=78;
		String d="B";
		
		String query="{call studpro1(?,?,?,?,?)}";
		
		CallableStatement cs=con.prepareCall(query);
		
		cs.setInt(1,a);
		cs.setString(2,b);
		cs.setInt(3,c);
		cs.setString(4,d);
		cs.registerOutParameter(5,java.sql.Types.BOOLEAN);
		cs.executeUpdate();
		
		boolean result=cs.getBoolean(5);
		
		if (result){
			System.out.println("Record Inserted");
			}
		else
		{
			System.out.println("Record Not Inserted");
			
		}

		

	}

}


/*

DELIMITER &&  
	CREATE PROCEDURE studpro1(
	in prno int(5),
	in psname varchar(20),
	in psper int(20),
	in pdiv varchar(20), 
	out resp boolean)
	BEGIN 
	insert into student values(prno,psname,psper,pdiv);
    set resp=true;
	END &&  
	DELIMITER ;
*/