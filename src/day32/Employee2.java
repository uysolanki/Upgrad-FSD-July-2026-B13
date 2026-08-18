package day32;

import java.util.Scanner;

public class Employee2 extends Person2 
{
	
	protected int empId;                        //total properties = 6
	protected String designation;
	protected double salary;
	
	public Employee2(String name, int age, String city,int empId, String designation,double salary)
	{
		super(name, age, city);
		this.empId=empId;
		this.designation=designation;
		this.salary=salary;
	}
	
	
	public void displayEmployee()
	{
		System.out.println("Employee ID is "+this.empId);
		System.out.println("Designation is "+this.designation);
		System.out.println("Salary is "+this.salary);
		super.displayPerson();
	}
}
