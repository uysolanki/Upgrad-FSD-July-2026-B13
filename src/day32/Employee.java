package day32;

import java.util.Scanner;

public class Employee extends Person {
	
	private int empId;                        //total properties = 6
	private String designation;
	private double salary;
	
	
	public void acceptEmployee()				//total methods = 4
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp ID");
		this.empId=sc.nextInt();
		
		System.out.println("enter designation");
		this.designation=sc.next();
		
		System.out.println("enter salary");
		this.salary=sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee ID is "+this.empId);
		System.out.println("Designation is "+this.designation);
		System.out.println("Salary is "+this.salary);
	}
}
