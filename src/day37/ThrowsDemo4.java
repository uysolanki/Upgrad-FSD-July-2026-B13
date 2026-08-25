package day37;

import java.util.Scanner;

public class ThrowsDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);							
		System.out.println("Enter Numerator");   
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator");           
		int denominator = sc.nextInt();			
		try {																//1. accept input
		double result=division(numerator,denominator);
		System.out.println("Result is "+result);						   //2. display result
		}
		catch(ArithmeticException ex1)										//3. exception handling
		{
			System.out.println("Please enter valid denominator");
		}
	}

	private static double division(int numerator,int denominator) throws ArithmeticException
	{
		
			double result=0.0;
		
			result=numerator/denominator;								//3. apply busines logic
			return result;
		
	}

}
