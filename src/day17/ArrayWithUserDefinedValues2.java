package day17;

import java.util.Scanner;

public class ArrayWithUserDefinedValues2 {  		//82373

	public static void main(String[] args) {
		int arr[]=new int[10];
		
		Scanner sc=new Scanner(System.in);	
		
		for(int i=0;i<arr.length;i++)						//                    i
		{											//0   1   2   3   4   5
			System.out.println("Enter a Number ");  //8   2   3   7   3
			arr[i]=sc.nextInt();
		}

		
		System.out.println(arr[0] + arr[arr.length-1]);
	}

}
