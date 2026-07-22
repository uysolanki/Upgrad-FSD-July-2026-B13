package day13;

import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=sc.nextInt();						//n			sum							rem
											//123		0		is 123>0 true 		3
	int sum=0;								//12        3       is 12>0 true        2
	while(n>0)								//1			5       is 1>0 true         1
	{										//0         6       is 0>0 false
		int rem=n%10;
		sum=sum+rem;   //sum+=rem;
		n=n/10;
	}
	
	System.out.println(sum);
}
}
