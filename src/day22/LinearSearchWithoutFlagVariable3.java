package day22;

public class LinearSearchWithoutFlagVariable3 {

	public static void main(String[] args) {
		//                     i
		//          0 1 2 3 4  5
		int arr[]= {8,7,3,6,5};
		int search=15;
		
		if(linearSearch(arr,search))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}

	private static boolean linearSearch(int[] arr, int search) {
		for(int n:arr)		                //n
		{									//7
			if(n==search)
			{
				return true;
			}
			
		}
		return false;
		
	}

}
