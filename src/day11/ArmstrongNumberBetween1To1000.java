package day11;

import java.util.Scanner;

public class ArmstrongNumberBetween1To1000 {

	public static void main(String[] args) {
		
		for(int i=1;i<=1000;i++)
		{
		int num=i;
		int sum=0;
		
		while(num>0)					//num			sum				rem         bu
		{								//2	            0                            2
			int rem=num%10;				//0             8
			                           
			sum=sum+(rem*rem*rem);  
			
			num=num/10;
		}
		
		if(i==sum)
		{
		System.out.println(i + " is Armstrong");
		}
	}
}
}
