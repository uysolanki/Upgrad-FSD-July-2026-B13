package day28;

public class Student {
	
	private int rno;
	private String studentName;
	private double per;
	
	public void acceptStudent()
	{
		rno=1;
		studentName="Alice";
		per=78.5;
	}
	
	public void displayStudent()
	{
		System.out.println("Roll Number is "+rno);
		System.out.println("Student Name is "+studentName);
		System.out.println("Percenatage is "+per);
	}
	

}
