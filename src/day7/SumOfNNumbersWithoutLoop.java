package day7;

import java.util.Scanner;

public class SumOfNNumbersWithoutLoop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();									//n
		int sum= n*(n+1) /2;								//4
		
		System.out.println("The sum is "+sum);

	}

}
