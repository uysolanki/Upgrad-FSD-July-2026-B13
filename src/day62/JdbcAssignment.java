package day62;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import day61.MySQLDBConnectionUpgradB13;
/*
create table empassg(
eno int primary key auto_increment,
ename varchar(20),
salary double,
dept varchar(20),
gender varchar(10) check(gender in('m','f')),
dob date); 
*/
public class JdbcAssignment {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner (System.in); 
		int choice; 
		do 
		{ 
			System.out.println("Menu options:"); 
			System.out.println("1.ADD"); 
			System.out.println("2.UPDATE"); 
			System.out.println("3.DELETE");
			System.out.println("4.DISPLAY"); 
			System.out.println("5.EXIT"); 
			System.out.println("Enter your choice:"); 
			choice = sc.nextInt(); 
			
			switch (choice) 
			{ 
			case 1: 
				
						System.out.println("****Add Employee*****");
						System.out.println("1.ADD Single"); 
						System.out.println("2.ADD Multiple");
						System.out.println("Enter your choice:"); 
						choice = sc.nextInt(); 
						switch(choice)
						{
						case 1 :
							System.out.println("Please enter Employee Name");
							String a=sc.next();
							
							System.out.println("Please enter Employee Salary");
							double b=sc.nextDouble();
							
							System.out.println("Please enter Employee Department");
							String c=sc.next();
							
							System.out.println("Please enter Employee gender m-male , f-female");
							String d=sc.next();
							
							System.out.println("Please enter Employee Date Of Birth (yyyy-mm-dd) 2026-11-28");
							String e=sc.next();
							
							Connection con=MySQLDBConnectionUpgradB13.getDBConnection();
							String query="insert into empassg(ename,salary,dept,gender,dob) values(?,?,?,?,?)";
							PreparedStatement ps=con.prepareStatement(query);
							
							ps.setString(1, a);
							ps.setDouble(2, b);
							ps.setString(3, c);
							ps.setString(4, d);
							ps.setString(5, e);
							
							int rows=ps.executeUpdate();
							if(rows>0)
								System.out.println(rows + " records inserted");
							
							ps.close();
							con.close();
							
						break;
						
						case 2 :System.out.println("Please enter how many employee records you want to add");
						int size = sc.nextInt();
						
						Connection con1=MySQLDBConnectionUpgradB13.getDBConnection();
						String query1="insert into empassg(ename,salary,dept,gender,dob) values(?,?,?,?,?)";
						
						PreparedStatement ps1=con1.prepareStatement(query1);
						
						for(int i =1;i<=size;i++) {
							System.out.println("Enter details for employee "+i);
							
							System.out.println("Please enter Employee Name");
							String a1=sc.next();
							
							System.out.println("Please enter Employee Salary");
							double b1=sc.nextDouble();
							
							System.out.println("Please enter Employee Department");
							String c1=sc.next();
							
							System.out.println("Please enter Employee gender m-male , f-female");
							String d1=sc.next();
							
							System.out.println("Please enter Employee Date Of Birth (yyyy-mm-dd) 2026-11-28");
							String e1=sc.next();
							
							ps1.setString(1, a1);
							ps1.setDouble(2, b1);
							ps1.setString(3, c1);
							ps1.setString(4, d1);
							ps1.setString(5, e1);
							
							ps1.addBatch();
						}
						int rows1[] = ps1.executeBatch();
						
						if(rows1.length>0) {
							System.out.println(rows1.length+" records inserted");
						}
						
						ps1.close();
						con1.close();
						
						break;
						
						default: System.out.println("Invalid Input");
						}
						
			break;
			case 2:
				
				System.out.println("Please Enter the id of the Employee You need to update: ");
				int n1 = sc.nextInt();
				
				System.out.println("The Employee is : ");
				
				Connection con3=MySQLDBConnectionUpgradB13.getDBConnection();
				String query3="select * from empassg where eno=? ";
				
				PreparedStatement ps3=con3.prepareStatement(query3);
				ps3.setInt(1, n1);
				
				ResultSet rs=ps3.executeQuery();
				
				System.out.println(String.format("%-20s%-20s%-20s%-20s", "Emp Name" , "Emp Salary" , "Emp Dept" , "Emp DOB"));
//				System.out.println(String.format("--------  ----------"));
				if(rs.next())
				{
					System.out.println(String.format("%-20s%-20.2f%-20s%-20s", rs.getString("ename") , rs.getDouble("salary") , rs.getString("dept") , rs.getString("dob") ));
				}
				
//				 the menu to update the choice 
				System.out.println("Choose what do you want to update :- "); 
				System.out.println("1.Name"); 
				System.out.println("2.Salary"); 
				System.out.println("3.Dept");
				System.out.println("4.DOB"); 
				System.out.println("Enter your choice:"); 
				int updateChoice = sc.nextInt();
				PreparedStatement ps5 ;
				
				switch( updateChoice) {
				case 1 :
					System.out.println("Enter the Updated Name : ");
					String name5 = sc.next() ;
					String query5 = " update empassg set ename = ? where eno = ? " ;
					ps5 = con3.prepareStatement(query5);
					ps5.setString(1, name5);
					ps5.setInt(2, n1 );
					
					int rowsUpdate = ps5.executeUpdate();
					ps5.close();
					
				break ;
				case 2 :
					System.out.println("Enter the Updated Salary : ");
					int updatedSalary = sc.nextInt() ;
					String updateSalary = " update empassg set salary = ? where eno = ? " ;
					ps5 = con3.prepareStatement(updateSalary);
					ps5.setInt(1, updatedSalary);
					ps5.setInt(2, n1 );
						
					rowsUpdate = ps5.executeUpdate();
					ps5.close();
				break ;
				case 3 :
					System.out.println("Enter the Updated Dept : ");
					String dept = sc.next() ;
					String queryDeptUpdate = " update empassg set dept = ? where eno = ? " ;
					ps5 = con3.prepareStatement(queryDeptUpdate);
					ps5.setString(1, dept);
					ps5.setInt(2, n1 );
					
					rowsUpdate = ps5.executeUpdate();
					ps5.close();
				break ;
				case 4 :
					System.out.println("Enter the Updated DOB : ");
					String dobUpdated = sc.next() ;
					String queryDobUpdated = " update empassg set dob = ? where eno = ? " ;
					ps5 = con3.prepareStatement(queryDobUpdated);
					ps5.setString(1, dobUpdated);
					ps5.setInt(2, n1 );
					
					rowsUpdate = ps5.executeUpdate();
					ps5.close();
				break ;
				}
				
				
				
				
				
				
				rs=ps3.executeQuery();
				
				System.out.println(String.format("%-20s%-20s%-20s%-20s", "Emp Name" , "Emp Salary" , "Emp Dept" , "Emp DOB"));
//				System.out.println(String.format("--------  ----------"));
				if(rs.next())
				{
					System.out.println(String.format("%-20s%-20.2f%-20s%-20s", rs.getString("ename") , rs.getDouble("salary") , rs.getString("dept") , rs.getString("dob") ));
				}
				
				
				rs.close();
				ps3.close();
				con3.close();
				
				
		    break;
			
			case 3:
				System.out.println("plz Enter Employee number to delete");
				int n=sc.nextInt();
				
				Connection con2=MySQLDBConnectionUpgradB13.getDBConnection();
				String query2="delete from empassg where eno =?";
				PreparedStatement ps2=con2.prepareStatement(query2);
				ps2.setInt(1, n);
				
				int rows2=ps2.executeUpdate();
				if(rows2>0)
					System.out.println(rows2 + " records Deleted");
				
				ps2.close();
				con2.close();
				
				
			break;
			
			}
		}while(choice!=5);
		
	}
	
}