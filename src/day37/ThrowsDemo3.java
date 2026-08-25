package day37;

import java.util.Scanner;

public class ThrowsDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);							
		System.out.println("Enter Numerator");   
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator");           
		int denominator = sc.nextInt();									//1. accept input
		double result=division(numerator,denominator);
		System.out.println("Result is "+result);						//2. display result
	}

	private static double division(int numerator,int denominator) {
		
		double result=0.0;
		try
		{	
			result=numerator/denominator;								//3. apply busines logic
			return result;
		}
		
		catch(ArithmeticException ex)									//4. handle exception
		{
			System.out.println("Denominator should be non zero value");
		}
		return result;
	}

}
