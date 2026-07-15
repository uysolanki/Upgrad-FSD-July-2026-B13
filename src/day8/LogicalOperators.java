package day8;

import java.util.Scanner;

public class LogicalOperators {
public static void main(String[] args) {
	
	//modeling camp
	//age 21 less
	//height 6.1 more
	
	int age;
	double height;
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Age");						//45
	age=sc.nextInt();		
	
	System.out.println("Enter Your Height in Feet");			//4.3
	height=sc.nextDouble();	
	

	//   False &&  True
	//is 45<21   6.3>6.1
	if(age<21 && height>6.1)
	{
		System.out.println("Eligible for Modeling");
	}
	else
	{
		System.out.println("Not Eligible for Modeling");
	}
}
}
