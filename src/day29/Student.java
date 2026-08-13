package day29;

import java.util.Scanner;

public class Student {
	
	private int rno;						//apna apna instance scope  aka object scope
	private String studentName;				//instance scope
	private double per;						//instance scope
	
	static private String batchName="B13";	//static aka class scope
	
	
	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your roll number"); //45
		this.rno=sc.nextInt();
		System.out.println("Enter your name");
		this.studentName=sc.next();
		System.out.println("Enter your percentage");
		this.per=sc.nextDouble();
	}
	
	public void displayStudent()
	{
		System.out.println("Roll Number is "+this.rno);
		System.out.println("Student Name is "+this.studentName);
		System.out.println("Percenatage is "+this.per);
		System.out.println("I am studying in batch "+ Student.batchName);
	}
}
