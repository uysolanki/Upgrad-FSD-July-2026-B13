package day3;

import java.util.Scanner;

public class SimpleInterestScenerio1 {

	public static void main(String[] args) 			//Ambani
	{
		simpleInterest();													//call

	}

	public static void simpleInterest()				//5* Hotel
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle");
		double principle=sc.nextDouble();
		
		System.out.println("Enter Rate Of Interest");
		double rate=sc.nextDouble();
		
		System.out.println("Enter Number of Years");
		double years=sc.nextDouble();										//buy
		
		
		double si=(principle*rate*years)/100;								//cook
		
		System.out.println("The Simple Interest is "+si);   				//serve
	}
}
