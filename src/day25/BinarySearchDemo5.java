package day25;

public class BinarySearchDemo5 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int search=44;
	int index=binarySearchUsingRecursion(arr,search,0,arr.length-1);
	System.out.println(index==-1?"Not Found":"Found at index "+index);
}

private static int binarySearchUsingRecursion(int[] arr,int search,int start,int end) {

	if(start<=end)
	{
		int mid = (start+end)/2;
		if(arr[mid]==search)
		{
			return mid;
		}
		else if(arr[mid]<search)
		{
			return binarySearchUsingRecursion(arr,search,mid+1,end);
		}
		else
		{
			return binarySearchUsingRecursion(arr,search,start,mid-1);
		}
	}
	
	return -1;
	
}
}
