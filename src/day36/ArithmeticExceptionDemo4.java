package day36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator"); 
		int denominator = sc.nextInt();
		
		double result=numerator/denominator;   //new ArithmeticException()
		System.out.println(result);
		}
		catch(ArithmeticException | InputMismatchException ex)
		{
			System.out.println("Invalid Input");
		}
		catch(Exception ex)
		{
			System.out.println("some exception occured");
		}
		
		System.out.println("Hiii");
	}
}
