//calculate & display sum of only odd numbers between 1 to 10
package day7;

import java.util.Scanner;

public class ContinueDemo {

	public static void main(String[] args) {
		

		int i=1;									//i		sum
													//1     0       is 1<=10 true      is 1%2==0 false
		int sum=0;									//2     1       is 2<=10 true      is 2%2==0 true
													//3		4		is 3<=10 true	   is 3%2==0 false
		while(i<=10)								//4      		is 4<=10 true	   is 4%2==0 true
		{											//5
			if(i%2==0)
			{
			i=i+1;
			continue;
			}											
			sum=sum+i;
			i=i+1;
		}
		
		System.out.println("The sum is "+sum);

	}

}

//1+3+5+7+9=25