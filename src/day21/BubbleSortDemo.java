package day21;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int arr[]= {7,6,9,8,3};
		
		System.out.println("Before "+Arrays.toString(arr));
		
		for(int i=1;i<=arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("After "+Arrays.toString(arr));
		
	}

}
