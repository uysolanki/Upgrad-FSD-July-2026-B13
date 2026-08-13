package day29;

import java.util.Scanner;

public class Student {
	
	private int rno;						//apna apna instance scope  aka object scope
	private String studentName;				//instance scope
	private double per;						//instance scope
	
	private static String batchName;	//static aka class scope
	private static String coodName;
	static
	{
		batchName="FSDB13";
		coodName="Srushti";
	}
	
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
	
	public void displayStudent()  //non static function
	{ 
		//int rno=9;
		System.out.println("Roll Number is "+this.rno);
		System.out.println("Student Name is "+this.studentName);
		System.out.println("Percenatage is "+this.per);
	}
	
	public static void displayBatchName()  //static function
	{
		System.out.println("I am studying in batch "+ Student.batchName);
		test();
	}
	
	public static void test()
	{
		System.out.println("HI");
	}
}
