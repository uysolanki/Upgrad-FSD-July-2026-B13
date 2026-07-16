package day9;

import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Entre a number");
	int n=sc.nextInt();
	
	int sum=0;
	int rem;
	while(n>0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	
	System.out.println("Sum of All digits is "+sum);
}
}
