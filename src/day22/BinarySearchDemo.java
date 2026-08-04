package day22;

public class BinarySearchDemo {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int start=0;
	int search=3;
	int end=arr.length-1;
	
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
