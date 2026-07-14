package day7;

import java.util.Scanner;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of times you wish to display your name");
		int n=sc.nextInt();
		for(int i=1;i<=n;i=i+1) 											//n		i				   output			
		{																	//5		1  is 1<=5 true    Umar
			System.out.println("Umar");										//		2  is 2<=5 true    Umar
																			//		3  is 3<=5 true    Umar
		}																	//		4  is 4<=5 true    Umar
	}																		//		5  is 5<=5 true    Umar
																			//		6  is 6<=5 false  
}

/*

Welcome5
Welcome3
Welcome1

*/