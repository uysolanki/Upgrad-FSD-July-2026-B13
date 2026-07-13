package day6;

import java.util.Scanner;

public class OnlyIfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your HSC percentage");
		double per=sc.nextDouble();
		
		if(per>=35.0)
		{
			System.out.println("Congratulations");
			System.out.println("Pass");
		}
	
		
		System.out.println("All the best!!");
	}

}
