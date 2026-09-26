package collectionrevision.day5;

public class InSortedArrayShowIndexOfNewNumberToBeAdded {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};   //10,000 length   T(n)   = O(n)
		int newNumber=35;
		
		
		int index=usingLinearSearch(arr,newNumber);
		System.out.println(index);
		
		
		int index1=usingBinarySearch(arr,newNumber);
		System.out.println(index1);

	}

	private static int usingBinarySearch(int[] arr, int newNumber) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(newNumber==arr[mid])
				return mid;
			
			if(newNumber>arr[mid])
				start=mid+1;
			
			else
				end=mid-1;
		}
		
		return start;
		
	}

	private static int usingLinearSearch(int[] arr, int newNumber) {
		int pos=0;											//i		pos			arr[i]			newNumber				
		for(int i=0;i<arr.length;i++)						//0		0			10				is 10<35 true
		{													//1		1			20				is 20<35 true
			if(arr[i]<newNumber)							//2     2           30				is 30<35 true
				pos++;										//3		3           40              is 40<35 false
		}
		return pos;
	}

}
