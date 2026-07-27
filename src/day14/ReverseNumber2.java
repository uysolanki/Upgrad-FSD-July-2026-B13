package day14;

import java.util.Scanner;

public class ReverseNumber2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");  
	int n=sc.nextInt();									//buy		
		int ans=reverse(n);						
	
	System.out.println(ans);
}

public static int reverse(int n)
{
	int rev=0;
	
	while(n>0)							
	{									
		int rem=n%10;					
		rev=rev*10+rem;   					
		n=n/10;							
	}
	return rev;
}
}
