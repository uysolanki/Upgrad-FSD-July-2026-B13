package day7;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int i=1;							//n		//i		sum
											//3		//1		0			is 1<=3 true
		int sum=0;							//		  2		1		    is 2<=3 true
											//        3     3		    is 3<=3 true
		while(i<=n)							//        4     6		    is 4<=3 false
		{											
			sum=sum+i;								
			
			i=i+1;
			
		}
		
		System.out.println("The sum is "+sum);

	}

}
