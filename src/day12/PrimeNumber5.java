package day12;

import java.util.Scanner;

public class PrimeNumber5 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();		 //num=7
	int flag=checkPrime(num);
	if(flag==0)
		System.out.println(num +" is Prime");
	else
		System.out.println(num +" is NOT Prime");
	
}

public static int checkPrime(int num) //num=8
{
	int flag=0;
	for(int i=2;i<=Math.sqrt(num);i++)
	{
		if(num%i==0)
		{
			flag=1;
			return flag;
		}
	}
	return flag;
}
}
