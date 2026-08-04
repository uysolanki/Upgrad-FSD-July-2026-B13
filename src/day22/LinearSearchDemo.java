package day22;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int arr[]= {8,7,3,6,5};
		int search=6;
		//int search=16;
		int flag=0;  //assuming number is not found
		
		for(int i=0;i<arr.length;i++)		//i		arr[i]
		{									//0		8
			if(arr[i]==search)
			{
				flag=1;
				System.out.println("Found at index "+i);
				break;
			}
			
		}
		
		if(flag==0)
			System.out.println("Not Found");

	}

}
