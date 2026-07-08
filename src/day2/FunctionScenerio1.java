package day2;

import java.util.Scanner;

public class FunctionScenerio1 {

	public static void main(String[] args)			//Ambani
	{
		areaRect();//call
	}
	
	public static void areaRect()					//5 * Hotel
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		int length=sc.nextInt();
		System.out.println("Enter Breadth of Rectangle");
		int breadth=sc.nextInt();									   //buy
		
		int area=length*breadth;									  //cook
		
		System.out.println("Area of Rectangle is "+area);  			  //serve
	}

}
