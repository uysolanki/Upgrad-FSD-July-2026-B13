package day17;

import java.util.Scanner;

public class SumOfArray2 {  		//82373

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter size of Array ");  
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		
		
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
