package day2;

import java.util.Scanner;

public class FunctionScenerio2 {

	public static void main(String[] args)			//Common man
	{
		int ans=areaRect();//call
		System.out.println("Area of Rectangle is "+ans);  			  //serve
	}
	
	public static int areaRect()					//honest caterer
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		int length=sc.nextInt();
		System.out.println("Enter Breadth of Rectangle");
		int breadth=sc.nextInt();									  //buy
		
		int area=length*breadth;									  //cook
		
		return area;
	}

}
//write 3 function by scenerio1,2,3 to calculate simple interest
//formulae simpleInterest = (principle*rateOfInterest*numberOfYears)/100;
