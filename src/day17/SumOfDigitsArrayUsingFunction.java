package day17;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigitsArrayUsingFunction { // 82373

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();

		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		for (int i = 0; i < arr1.length; i++) // i
		{ // 0
			System.out.println("enter a number");
			arr1[i] = sc.nextInt();
		}

		System.out.println("Before " +Arrays.toString(arr1));
		reverseArray(arr1,arr2);

		System.out.println("After " +Arrays.toString(arr2));

	}

	private static void reverseArray(int[] arr1,int arr2[]) {
		
		
		for(int i=0;i<arr1.length;i++)				//i			arr[i]
		{											//0         123
			int ans=reverse(arr1[i]);
			arr2[i]=ans;
		}
		
		
	}

	private static int reverse(int n) {
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

//[8,  2,	3,	7,	3,	0,	7,	2,	2,	9]