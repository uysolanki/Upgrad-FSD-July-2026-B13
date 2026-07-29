package day18;

import java.util.Arrays;
import java.util.Scanner;

public class MobileNumberArray2 {

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
			while(mobileNumber>0)
			{
				int rem= (int)mobileNumber%10;
				if(rem%2!=0)
					oddCount++;
				
				mobileNumber=mobileNumber/10;
			}
			String numberType="";
			if(oddCount>5)
				numberType="Odd Biased Number";
			else if(oddCount<5)
				numberType="Even Biased Number";
			else
				numberType="Balanced Number";
			
			System.out.println("Mobile Number " +(i+1) + " is " + mobiles[i] +", it has " +oddCount+" odd digits & "+ (10-oddCount) +" even digits, it is "+numberType);
		}
		
	}

}
