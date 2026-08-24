package day36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {

		int arr[]=new int[2];						//0					1
		try											//10				0
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for 0 index");
		arr[0]=sc.nextInt();
		System.out.println("Enter value for 1 index");
		arr[1]=sc.nextInt();

					try
					{
					System.out.println("enter index of the number you wish to be numerator");	//3
					int n=sc.nextInt();			//n=0
					int numerator=arr[n];
					
					System.out.println("enter index of the number you wish to be denominator");  //1
					int d=sc.nextInt();	        //d=0
					int denominator=arr[d];
					
					double result=numerator/denominator;
					System.out.println("Result is "+result);
					}
					catch (ArithmeticException e) {
						System.out.println("Denominator cannot be zero");
					}
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Please enter valid index [0 / 1 ] only");
					}
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Please enter integer values only");
		}
	}

}
