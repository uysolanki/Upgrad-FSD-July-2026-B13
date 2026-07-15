package day7;

import java.util.Scanner;

public class BreakDemo {

	public static void main(String[] args) {
		

		int i=1;									//i		sum
													//1     0      is 1<=10 true     is 1==5 false 
		int sum=0;									//2		1	   is 2<=10 true	 is 2==5 false
													//3		3	   is 3<=10 true     is 3==5 false
		while(i<=10)								//4     6      is 4<=10 true     is 4==5 false
		{											//5	    10     is 5<=10 true     is 5==5 true    break 
			sum=sum+i;								//      15     loop terminate
			
			if(i==5)
				{
				break;
				}
			
			i=i+1;
			
		}
		
		System.out.println("The sum is "+sum);

	}

}
