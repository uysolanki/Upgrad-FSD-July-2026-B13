package day25;

public class BinarySearchDemo4 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int search=4;
	int index=binarySearchUsingIteration(arr,search,0,arr.length-1);
	System.out.println(index==-1?"Not Found":"Found at index "+index);
}

private static int binarySearchUsingIteration(int[] arr,int search,int start,int end) {

	while(start<=end)
	{
		int mid = (start+end)/2;
		if(arr[mid]==search)
		{
			return mid;
		}
		else if(arr[mid]<search)
		{
			start=mid+1;
		}
		else
		{
			end=mid-1;
		}
	}
	
	
	return -1;
	
}
}
