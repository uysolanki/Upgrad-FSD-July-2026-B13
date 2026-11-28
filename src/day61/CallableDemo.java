package day61;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CallableDemo {

	public static void main(String[] args) throws Exception
	{
		Connection con = MySQLDBConnectionUpgradB13.getDBConnection();
		
		int a=18;
		String b ="virat";
		int c=87;
		String d="A";
		
		String query="{call studpro(?,?,?,?,?)}";
		
		CallableStatement cs=con.prepareCall(query);
		
		cs.setInt(1,a);
		cs.setString(2,b);
		cs.setInt(3,c);
		cs.setString(4,d);
		cs.registerOutParameter(5,java.sql.Types.VARCHAR);
		cs.executeUpdate();
		
		String result=cs.getString(5);
		
		if (result.equals("true")){
			System.out.println("Record Inserted");
			}
		else
		{
			System.out.println("Record Not Inserted");
			
		}	
	}
}
/*
CREATE TABLE student (
rno int(5),
sname varchar(20),
per int(5),
division varchar(20),
PRIMARY KEY (rno));
*/


/*
DELIMITER &&  
	CREATE PROCEDURE studpro(
	in prno int(5),
	in psname varchar(20),
	in psper int(20),
	in pdiv varchar(20), 
	out resp varchar(20))
	BEGIN 
	insert into student values(prno,psname,psper,pdiv);
    set resp='true';
	END &&  
	DELIMITER ; 
 
*/
