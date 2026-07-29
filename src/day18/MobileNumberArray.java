package day18;

import java.util.Arrays;
import java.util.Scanner;

public class MobileNumberArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();

		long mobiles[] = new long[size];
		
		
		for (int i = 0; i < mobiles.length; i++) // i
		{
			System.out.println("enter Mobile number");
			mobiles[i] = sc.nextLong();
		}

		System.out.println(Arrays.toString(mobiles));  
		display(mobiles);

	}

	private static void display(long[] mobiles) {
		
		for(int i=0;i<mobiles.length;i++)
		{
			long mobileNumber=mobiles[i];
			int oddCount=0;
			int evenCount=0;
			while(mobileNumber>0)
			{
				int rem= (int)mobileNumber%10;
				if(rem%2==0)
					evenCount++;
				else
					oddCount++;
				mobileNumber=mobileNumber/10;
			}
			String numberType="";
			if(oddCount>evenCount)
				numberType="Odd Biased Number";
			else if(oddCount<evenCount)
				numberType="Even Biased";
			else
				numberType="Balanced Number";
			
		//	System.out.println("Mobile Number " +(i+1) + " is " + mobiles[i] +", it has " +oddCount+" odd digits & "+evenCount +" even digits, it is "+numberType);
System.out.printf("\nMobile Number %d is %d, it has %d odd digits & %d even digits, it is %s",(i+1),mobiles[i],oddCount,evenCount,numberType);
			
		}
		
	}

}
