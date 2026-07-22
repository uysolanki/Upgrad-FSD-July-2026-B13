package day13;

import java.util.Scanner;

public class SumOfDigit2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");  //777
	int n=sc.nextInt();						
	
	while(n>9)									//n							sum					rem
	{											//777		is 777>9 true	0	is 777>0 true   7
			int sum=0;							//77				        7   is 77>0 true    7
			while(n>0)							//7                         14	is 7>0 true     7
			{									//0                         21	is 0>0 false
				int rem=n%10;					//21        is 21>9  true   0   is 21>0 true
				sum=sum+rem;   					//2                         1   is 2>0 true     1
				n=n/10;							//0                         3   is 0>0 fasle    2
			}									//3         is 3>9 false   output 3
			n=sum;
	}
	
	System.out.println(n);
}
}
