package day37;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo6 {

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);							
		System.out.println("Enter Numerator");   
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator");           
		int denominator = sc.nextInt();			
																	//1. accept input
		double result=division(numerator,denominator);
		System.out.println("Result is "+result);						   //2. display result
		
	}

	private static double division(int numerator,int denominator) throws IOException
	{
			return numerator/denominator;								   //4. apply busines logic
	}

}
