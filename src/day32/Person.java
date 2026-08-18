package day32;

import java.util.Scanner;

public class Person {						//total properties = 3

	protected String name;
	protected int age;
	protected String city;
	
	public void acceptPerson()				//total methods = 2
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		this.name=sc.next();
		
		System.out.println("enter age");
		this.age=sc.nextInt();
		
		System.out.println("enter city");
		this.city=sc.next();
	}
	
	public void displayPerson()
	{
		System.out.println("Name is "+this.name);
		System.out.println("Age is "+this.age);
		System.out.println("City is "+this.city);
	}
}
