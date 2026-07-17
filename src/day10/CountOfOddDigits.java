package day10;

import java.util.Scanner;

public class CountOfOddDigits {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();		//786451 , 78645, 7864, 786, 78, 7, 0
		
		int counter=0;
		
		while(num>0)				//counter 0,1,2,3
		{
			int rem=num%10;
			if(rem%2==1)
			{
				counter++;
			}
			num=num/10;
		}
		
		System.out.println(counter);
		
	}
}


// 153

//1


// 1     5      3
//1     125    27
//153

//370
//3     7     0
//27    343   0
//370

//371
//3     7      1
//27    343    1
//371

//407
//4     0      7
//64    0      343
//407