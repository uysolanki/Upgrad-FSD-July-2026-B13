package day18;

import java.util.Arrays;
import java.util.Scanner;

public class BusinessTarget2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days shop open in a week");
		int size = sc.nextInt();

		int income[] = new int[size];
		
		
		for (int i = 0; i < income.length; i++) // i
		{
			System.out.println("enter income for day "+ (i+1));
			income[i] = sc.nextInt();
		}

		System.out.println("Weekly Income " +Arrays.toString(income));  
		targets(income);

	}

	private static void targets(int[] income) {         //mon tue 
		Scanner sc = new Scanner(System.in);            // 0   1   2    3   4    5    6
		System.out.println("Enter number of targets");  //[500,700,1000,600,1200,1500,1300]  =4800
		int targetCount = sc.nextInt();					//targetCount
		int sum=0;//monday morn his bal=0				//3
		int k=0;  //work starting frm which day - 0
		for(int i=1;i<=targetCount;i++)					
		{
			System.out.println("Enter Target " + i);
			int target=sc.nextInt();  					//target      sum      					flag		j
														//2000        0       					1			0
			int flag=0;									//            500  is 500>=2000 False				1
			for(int j=k;j<income.length;j++)			//			  1200 is 1200>=2000 False				2
			{											//            2200  is 2200>=2000 True
				sum+=income[j];
				if(sum>=target)
				{
					System.out.println("Target achieved on day "+(j+1));
					flag=1;
					sum=sum-target;
					k=j+1;
					break;								//3500		
				}
			}											//20000
			
			if(flag==0)
			{
				System.out.println("Mission Impossible");
				sum=0;
			}
		}
		
	}

}
