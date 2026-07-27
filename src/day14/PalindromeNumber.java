package day14;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");  
	int n=sc.nextInt();			//154				
	int ans=reverse(n);			//451			
	
	if(n==ans)
		System.out.println(n + " is Palindrome");
	else
		System.out.println(n + " is NOT Palindrome");
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
