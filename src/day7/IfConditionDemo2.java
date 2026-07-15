package day7;

import java.util.Scanner;

public class IfConditionDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=3;i++)									//i                  per                        o/p
		{														//1	 is 1<=3  true   67.5  is 67.5>=35.0 true   Cong Pass
			System.out.println("Enter your HSC percentage");	//2  is 2<=3  true   32.7  is 32.5>=35.0 false  Fail
			double per=sc.nextDouble();							//3  is 3<=3  true   76.8  is 76.8>=35.0 true   Cong Pass
																//4  is 4<=3  false loop terminate              A T B
			if(per>=35.0)
			{
			System.out.println("Congratulations");
			System.out.println("Pass");
			}
			else
			System.out.println("Fail");
		}
		
		System.out.println("All the best!!");
	}

}
