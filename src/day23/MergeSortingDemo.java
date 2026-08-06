package day23;

import java.util.Arrays;

public class MergeSortingDemo {

	public static void main(String[] args) {
		int arr[]= {8,2,3,7,4,5};
		System.out.println("Before " + Arrays.toString(arr));
		mergeSorting(arr,0,arr.length-1);
		System.out.println("After " + Arrays.toString(arr));

	}

	public static void mergeSorting(int[] arr, int left, int right) {
		if(left<right)  //base condtition
		{
			int mid=(left+right)/2;
			mergeSorting(arr,left,mid);
			mergeSorting(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
		
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		
		int i=left;
		int j=mid+1;
		int k=left;
		int brr[]=new int[arr.length];
		
		while(i<=mid && j<=right)
		{
			if(arr[i]<=arr[j])
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid)
		{
			for(int z=j;z<=right;z++)
			{
				brr[k]=arr[z];
				k++;
			}
		}
		
		if(j>right)
		{
			for(int z=i;z<=mid;z++)
			{
				brr[k]=arr[z];
				k++;
			}
		}
		
		for(int m=left;m<=right;m++)
			arr[m]=brr[m];
			
		
	}

}

/*
//O(n log n)
            i                        j
1  2  8  9                  3       15      16     21

k
1  2  3  8   9

*/