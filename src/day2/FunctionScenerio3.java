package day2;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args)			//common man
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		int length=sc.nextInt();
		System.out.println("Enter Breadth of Rectangle");
		int breadth=sc.nextInt();									//buy
		int ans=areaRect(length,breadth);							//call
		System.out.println("Area of Rectangle is "+ans);  			//serve
	}
	
	public static int areaRect(int length,int breadth)	//dishonest caterer
	{									 
		int area=length*breadth;									  //cook
		return area;
	}

}
