package day37;

import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		division();
	}

	private static void division() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");   
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator");           
		int denominator = sc.nextInt();                 //1. accept
		
		try
		{
			double result=numerator/denominator;		//2. apply business logic
			System.out.println("Result is "+result);	//3. display result
		}
		
		catch(ArithmeticException ex)					//4. exception handling
		{
			System.out.println("Denominator should be non zero value");
		}
	}

}
