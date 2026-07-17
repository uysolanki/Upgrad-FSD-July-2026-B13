package day10;

import java.util.Scanner;

public class ArmstrongUsingFunctionUsingConditionalOperator {

	
public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();		//153
		int sum=checkArmstrong(num);
		
		System.out.println(num==sum?"num + " + "is Armstrong" :num + " is not Armstrong");
		
		
		
	}
	
	
	
	public static int checkArmstrong(int num)
	{
		int sum=0;
		
		while(num>0)					//num			sum				rem         bu
		{								//153           0				3           153
			int rem=num%10;				//15            27              5
			                            //1             152             1
			sum=sum+(rem*rem*rem);  //0             153
			
			num=num/10;
		}
		
		return  sum;
		
	}
}
