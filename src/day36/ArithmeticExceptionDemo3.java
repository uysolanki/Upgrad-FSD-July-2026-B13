package day36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticExceptionDemo3 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
		System.out.println("Enter Numerator");
		int numerator =Integer.parseInt(br.readLine());
		System.out.println("Enter Denominator");
		int denominator = Integer.parseInt(br.readLine());
		double result=numerator/denominator;
		System.out.println(result);
		}
		catch(IOException  ex)
		{
			System.out.println("");
		}
	}
}
