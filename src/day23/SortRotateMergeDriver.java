package day23;

import java.util.Arrays;

public class SortRotateMergeDriver {

	public static void main(String[] args) {                            //                   j
		int arr[]= {8,2,3,7,4,5};                                       //0  1  2  3  4  5   6
		System.out.println("Before Sorting" + Arrays.toString(arr));
		MergeSortingDemo.mergeSorting(arr,0,arr.length-1);				//2, 3, 4, 5, 7, 8
		System.out.println("After Sorting" + Arrays.toString(arr));     //3, 4, 5, 7, 8, 2
		 																//4, 5, 7, 8, 2, 3
																		//5, 7, 8, 2, 3, 4
																		//temp=2
		
		int mid=arr.length/2;
		
		rotateArrayMid(arr,mid);
		System.out.println("After Rotating" + Arrays.toString(arr));
		
		int search=13;
		int index=searchArray(arr,search);
		if(index==-1)
			System.out.println(search +" is not Found");
		else
			System.out.println("Found at Index "+index);
	}

	private static int searchArray(int[] arr, int search) {
		int mid=(0+arr.length-1)/2;   //mid=2
		
		if(search>=arr[0])
		{
		return binarySearch(arr,0,mid,search);
		}
		else   //green side binary search
		{
		return binarySearch(arr,mid+1, arr.length-1,search);
		}

	}

	private static int binarySearch(int[] arr, int start, int end,int search) {
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==search)
				return mid;
			else if(arr[mid]<search)
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
		
	}

	private static void rotateArrayMid(int[] arr, int mid) {
		int i=1;
		while(i<=mid)
		{
			int temp=arr[0];
			int j;
			for(j=1;j<arr.length;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[j-1]=temp;
			i++;
		}
		
	}

}
