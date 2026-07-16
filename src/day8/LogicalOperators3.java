package day8;

import java.util.Scanner;

public class LogicalOperators3 {
public static void main(String[] args) {
	
	//modeling camp
	//male criterea
	//age 21 less
	//height 6.1 more
	
	//female criterea
	//age 19 less
	//height 5.6 more
	
	int age;
	double height;
	int nepotism;
	int gender;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Your Gender [1-male 0-female]");						//45
	gender=sc.nextInt();
	
	System.out.println("Enter Your Age");						//45
	age=sc.nextInt();		
	
	System.out.println("Enter Your Height in Feet");			//4.3
	height=sc.nextDouble();	
	
	System.out.println("Is your parent in the Modelling Industry [1-yes, 0-No]");			//1
	nepotism=sc.nextInt();	
	//	      False            ||     True
	//   False &&  False              True
	//is 45<21   4.3>6.1              1==1
	if( (gender==1 && age<21 && height>6.1) ||  (gender==0 && age<19 && height>5.6) || !(nepotism==1) )
	{
		System.out.println("Eligible for Modeling");
	}
	else
	{
		System.out.println("Not Eligible for Modeling");
	}
}
}
