package day6;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your HSC percentage");		//53.3
		double per=sc.nextDouble();
		
		if(per>=70.0)
		{
			System.out.println("DISTINCTION");
		}
		else if(per>=60.0)
		{
			System.out.println("First class");
		}
		else if(per>=50.0)
		{
			System.out.println("Second class");
		}
		else if(per>=35.0)
		{
			System.out.println("Pass class");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		System.out.println("All the best!!");
	}

}
