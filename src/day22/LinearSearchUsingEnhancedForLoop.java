package day22;

public class LinearSearchUsingEnhancedForLoop {

	public static void main(String[] args) {
		int arr[]= {8,7,3,6,5};
		int search=6;
		//int search=16;
		int flag=0;  //assuming number is not found
		
		for(int n:arr)		                //n
		{									//7
			if(n==search)
			{
				flag=1;
				System.out.println("Found");
				break;
			}
			
		}
		
		if(flag==0)
			System.out.println("Not Found");

	}

}
