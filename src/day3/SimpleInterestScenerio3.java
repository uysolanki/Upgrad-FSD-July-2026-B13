package day3;

import java.util.Scanner;

public class SimpleInterestScenerio3 {

	public static void main(String[] args) 			//Common man
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle");   //1000.0
		double principle=sc.nextDouble();
		
		System.out.println("Enter Rate Of Interest");
		double rate=sc.nextDouble();
		
		System.out.println("Enter Number of Years");
		double years=sc.nextDouble();										//buy
		
		
		int ans=(int)simpleInterest(principle,rate,years);					//function call
		System.out.println("The Simple Interest is "+ans);  			 	//serve
	}

	public static double simpleInterest(double p,double r,double n)				//dishonest caterer
	{
		
		double si=(p*r*n)/100;								//cook
		
		return si;
	}
}
