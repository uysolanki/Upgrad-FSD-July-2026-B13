package day10;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();		//153
		int bu=num;
		int sum=0;
		
		while(num>0)					//num			sum				rem         bu
		{								//153           0				3           153
			int rem=num%10;				//15            27              5
			                            //1             152             1
			sum=sum+(rem*rem*rem);  //0             153
			
			num=num/10;
		}
		
		if(bu==sum)
		{
		System.out.println(bu + " is Armstrong");
		}
		else
		{
			System.out.println(bu + " is not Armstrong");
		}
		
	}
}
