package day6;

import java.util.Scanner;

public class IfConditionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your HSC percentage");
		double per=sc.nextDouble();
		
		if(per>=35.0)
		{
			System.out.println("Congratulations");
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println("All the best!!");
	}

}
