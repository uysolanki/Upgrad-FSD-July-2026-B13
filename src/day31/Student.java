package day31;

import java.util.Scanner;

public class Student {
	
	private int rno;						
	private String studentName;				
	private double per;						
	
	
	public Student()   //NoArgsConstructor
	{
		this.rno=1;
		this.studentName="Rahul";
		this.per=40.0;
	}
	
	public Student(int x, String y, double z)   //AllArgsConstructor
	{
		this.rno=x;
		this.studentName=y;
		this.per=z;
	}
	
	public Student(Student st)   //CopyConstructor
	{
		this.rno=st.rno;
		this.studentName=st.studentName;
		this.per=st.per;
	}
	
	public void displayStudent() 
	{ 
		System.out.println("Roll Number is "+this.rno);
		System.out.println("Student Name is "+this.studentName);
		System.out.println("Percenatage is "+this.per);
	}
	
}
