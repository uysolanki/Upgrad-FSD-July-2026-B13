package day17;

import java.util.Scanner;

public class SumOfArray {  		//82373

	public static void main(String[] args) {
		int arr[]=new int[10];
		
		Scanner sc=new Scanner(System.in);	
		
		//accept for loop
		for(int i=0;i<arr.length;i++)					
		{											
			System.out.println("Enter a Number ");  
			arr[i]=sc.nextInt();
		}

		
		int sum=0;
		
		//calculate sum for loop
		for(int i=0;i<arr.length;i++)					
		{											
			sum=sum+arr[i];
		}

		System.out.println("Sum of Array is "+sum);
		
	}

}
