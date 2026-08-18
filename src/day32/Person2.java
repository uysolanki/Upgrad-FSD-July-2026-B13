package day32;

import java.util.Scanner;

public class Person2 {						//total properties = 3

	protected String name;
	protected int age;
	protected String city;
	
	
	public Person2() {}
	
	public Person2(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}



	public void displayPerson()
	{
		System.out.println("Name is "+this.name);
		System.out.println("Age is "+this.age);
		System.out.println("City is "+this.city);
	}
}
