package day36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");   //"apple"     10
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator");            //  0
		int denominator = sc.nextInt();
		//String name="Alice";
		String name=null;
		System.out.println(name.length());
		double result=numerator/denominator;   //new ArithmeticException()
		System.out.println(result);
		}
		catch(ArithmeticException ex)
		{
//			System.out.println(ex.getMessage());
			System.out.println("Denominator should be non zero value");
		}
		catch(InputMismatchException ex)
		{
//			System.out.println(ex.getMessage());
			System.out.println("Please enter valid integer values only");
		}
		catch(Exception ex)
		{
//			System.out.println(ex.getMessage());
			System.out.println("some exception occured");
		}
		
		System.out.println("Hiii");
	}
}
