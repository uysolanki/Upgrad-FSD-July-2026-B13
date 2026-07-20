package day11;

import java.util.Scanner;

public class PrimeNumber2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();		
	int flag=0;
	int iterationCounter=0;
	for(int i=2;i<num;i++)
	{
		iterationCounter++;
		if(num%i==0)
		{
			flag=1;
			break;
		}
	}
	
	if(flag==0)
		System.out.println(num +" is Prime");
	else
		System.out.println(num +" is NOT Prime");
	
	System.out.println("Iteration count is "+iterationCounter);
}
}
