package day11;

import java.util.Scanner;

public class ArmstrongBetween1To1000UsingFunction4 {

	
public static void main(String[] args) {
		

		for(int i=1;i<=1000;i++)
		if(i==checkArmstrong(i)) System.out.println(i + " is Armstrong");
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
