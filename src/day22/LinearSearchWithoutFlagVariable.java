package day22;

public class LinearSearchWithoutFlagVariable {

	public static void main(String[] args) {
		//                     i
		//          0 1 2 3 4  5
		int arr[]= {8,7,3,6,5};
		int search=5;
		
		int i=0;
		for(i=0;i<arr.length;i++)		
		{									
			if(arr[i]==search)
			{
				System.out.println("Found at index "+i);
				break;
			}
			
		}
		
		if(i==arr.length)
			System.out.println("Not Found");

	}

}
