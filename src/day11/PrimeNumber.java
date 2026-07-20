package day11;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();		
	int counter=0;
	int iterationCounter=0;
	for(int i=1;i<=num;i++)
	{
		iterationCounter++;
		if(num%i==0)
		{
			counter++;
		}
	}
	
	if(counter==2)
		System.out.println(num +" is Prime");
	else
		System.out.println(num +" is NOT Prime");
	
	System.out.println("Iteration count is "+iterationCounter);
}
}
