package day32;

public class Employee3 extends Person3
{
	
	protected int empId;                        //total properties = 6
	protected String designation;
	protected double salary;
	
	public Employee3() {
		//super();
		System.out.println("Good Evening");
	}
	
	public Employee3(String name, int age, String city,int empId, String designation,double salary)
	{
		//super(name, age, city);
		//super();
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
