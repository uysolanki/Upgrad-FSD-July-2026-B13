package day31;

import java.util.Scanner;

public class StudentDriverApp {

	public static void main(String[] args) {
		Student s1=new Student();   //0 null 0.0
		
		
		Student s2=new Student();
		
		Student s3=new Student();
		
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		System.out.println("*****");
		Student s4=new Student(18,"Sushmita",98.6);
		s4.displayStudent();
		
		Student s5=new Student(s4);
		s5.displayStudent();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number");
		int a=sc.nextInt();
		
		System.out.println("Enter Student name");
		String b=sc.next();
		
		System.out.println("Enter Percentage");
		double c=sc.nextDouble();
		
		Student s6=new Student(a,b,c);
		s6.displayStudent();
		
		System.out.println("Enter roll number");
		int a1=sc.nextInt();
		
		System.out.println("Enter Student name");
		String b1=sc.next();
		
		System.out.println("Enter Percentage");
		double c1=sc.nextDouble();
		Student s7=new Student(a1,b1,c1);
		s7.displayStudent();
		
	}

}
