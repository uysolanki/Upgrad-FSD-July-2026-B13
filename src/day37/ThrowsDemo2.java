package day37;

import java.util.Scanner;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");   
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator");           
		int denominator = sc.nextInt();
		division(numerator,denominator);						//1. accept input
	}

	private static void division(int numerator,int denominator) {
		try
		{
			double result=numerator/denominator;				//2. apply business logic
			System.out.println("Result is "+result);			//3. display result
		}
		
		catch(ArithmeticException ex)							//handle exception
		{
			System.out.println("Denominator should be non zero value");
		}
	}

}
