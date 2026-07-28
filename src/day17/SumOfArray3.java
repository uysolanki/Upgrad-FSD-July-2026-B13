package day17;

import java.util.Scanner;

public class SumOfArray3 {  		//82373

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)			//i
		{										//0
			System.out.println("enter a number");
			arr[i]=sc.nextInt();
		}
			
		
		for(int i=0;i<arr.length;i++)			//i
		{										//0
			System.out.print(arr[i]+"\t");
		}

		int sumOfAll=0;
		int sumOfOdds=0;
		int sumOfEvens=0;
		
//		int sumOfAll,sumOfOdds,sumOfEvens;
//		sumOfAll=sumOfEvens=sumOfOdds=0;
		for(int i=0;i<arr.length;i++)			
		{
			sumOfAll=sumOfAll+arr[i];
			
			if(arr[i]%2==0)
				sumOfEvens+=arr[i];
			
			if(arr[i]%2==1)
				sumOfOdds+=arr[i];
		}
		
		System.out.println("\nSum of All Numbers "+sumOfAll);
		System.out.println("Sum of All Even Numbers "+sumOfEvens);
		System.out.println("Sum of All Odd Numbers "+sumOfOdds);
		}

}
