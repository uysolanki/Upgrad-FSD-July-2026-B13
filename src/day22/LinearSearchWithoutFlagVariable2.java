package day22;

public class LinearSearchWithoutFlagVariable2 {

	public static void main(String[] args) {
		
		int arr[]= {8,7,3,6,5};
		int search=15;
		
	
		System.out.println(linearSearch(arr,search)?"Found":"NotFound");
		
	}

	private static boolean linearSearch(int[] arr, int search) {
		for(int n:arr)		                
		{									
			if(n==search)
				return true;	
		}
		return false;
	}

}
