package collectionrevision.day6;

public class SumOfOddEven2 {

	public static void main(String[] args) {
		//          0 1 2 3 4 5 6 7 8
		int arr[]= {1,7,6,8,3,5,4,6,2};  //14,26
		
		int i=0;												//i		j   oddSum	evenSum
	//	int j=i+1;												//0     1   0       0       is 0<9    is 0==8 F
		int sumOdd=0;											//2		3	7		1       is 2<9 T  is 2==8 F
		int sumEven=0;											//4     5   15      7       is 4<9 T  is 4==8 F
		while(i<arr.length)										//6	    7   20		10      is 6<9 T  is 6==8 F  
		{														//8		9	26		14      is 8<9 T  is 8==8 F loop ter
																//					16
			sumEven+=arr[i];
			
			if(i==arr.length-1)
				break;
			
			sumOdd+=arr[i+1];
			i+=2;
		}
		
		System.out.println("Sum of All values at ODD indexes is "+sumOdd);
		System.out.println("Sum of All values at EVEN indexes is "+sumEven);
	}

}
