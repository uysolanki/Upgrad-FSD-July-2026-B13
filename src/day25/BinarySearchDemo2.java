package day25;

public class BinarySearchDemo2 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int search=14;
	binarySearchUsingIteration(arr,search,0,arr.length-1);
}

private static void binarySearchUsingIteration(int[] arr,int search,int start,int end) {

	while(start<=end)
	{
		int mid = (start+end)/2;
		if(arr[mid]==search)
		{
			System.out.println("Found at index "+mid);
			break;
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
	
	
	if(start>end)
		System.out.println("Not Found");
	
}
}
