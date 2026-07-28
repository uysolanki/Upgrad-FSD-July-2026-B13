package day17;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {  		//82373

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
			
		

		System.out.println(Arrays.toString(arr));
		
		
		int max=arr[0];
	
		for(int i=1;i<arr.length;i++)			
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		
		System.out.println("\nmaximum number from array is "+max);
		}

}


//[8,  2,	3,	7,	3,	0,	7,	2,	2,	9]