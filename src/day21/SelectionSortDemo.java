package day21;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int arr[]= {7,6,9,8,3};
		
		System.out.println("Before "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("After "+Arrays.toString(arr));
		
	}

}
