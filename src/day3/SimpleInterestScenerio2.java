package day3;

import java.util.Scanner;

public class SimpleInterestScenerio2 {

	public static void main(String[] args) 			//Common man
	{	
		int ans=(int)simpleInterest();										//call
		System.out.println("The Simple Interest is "+ans);  			 	//serve
	}

	public static double simpleInterest()				//honest caterer
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle");
		double principle=sc.nextDouble();
		
		System.out.println("Enter Rate Of Interest");
		double rate=sc.nextDouble();
		
		System.out.println("Enter Number of Years");
		double years=sc.nextDouble();										//buy
		
		
		double si=(principle*rate*years)/100;								//cook
		
		return si;
	}
}
