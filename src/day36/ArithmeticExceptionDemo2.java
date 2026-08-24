package day36;

import java.util.Scanner;

public class ArithmeticExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator"); 
		int denominator = sc.nextInt();
		try
		{
		double result=numerator/denominator;   //new ArithmeticException()
		System.out.println(result);
		}
		catch(ArithmeticException ex)
		{
//			System.out.println(ex.getMessage());
			System.out.println("Denominator should be non zero value");
		}
		
		System.out.println("Hiii");
	}
}
