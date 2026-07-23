package day13;

import java.util.Scanner;

public class FibonacciSeries2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Length of Fibonacci Series");
	int length=sc.nextInt();
	int n1=0;
	int n2=1;
	
	System.out.println(n1);
	System.out.println(n2);
	
	for(int i=3;i<=length;i++)
	{
		int n3=n1+n2;
		System.out.println(n3);
		n2=n3;
		n1=n2;
	}
	
}
}
