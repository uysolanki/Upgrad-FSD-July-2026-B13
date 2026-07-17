package day10;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();		//786451 , 78645, 7864, 786, 78, 7, 0
		
		int counter=0;
		
		while(num>0)				//counter 0,1,2,3
		{
			int rem=num%10;
			
				counter++;
			
			num=num/10;
		}
		
		System.out.println("Count of All digits " +counter);
		
	}
}
