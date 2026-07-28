package day1;

import java.util.Scanner;

public class MyFirstJavaApp {
	
	public static void main(String[] args) {
		
		
		area(5); // function call						//hard coded values
		area(7);
		area(9);
		area(13);
		
		Scanner sc=new Scanner(System.in);				//user defined values
		System.out.println("Enter a radius");
		int radius=sc.nextInt();
		
		area(radius);

	}
										
	public static void area(int radius)  //function defination  aka  function body
	{
		double area=3.14*radius*radius;
		System.out.println("Area of Circle having radius " + radius + " is " + area); //39.25
	}
	
}


/*
Mahendra Singh Dhoni   
MahendraSinghDhoni  -> Pascal case  -> class/interface Name

mahendraSinghDhoni  -> camel case   -> function/variable name

mahendra-singh-dhoni  -> kebab case  -> css/javascript

mahendra_singh_dhoni  -> snake case  -> javascript

mahendrasinghdhoni  -> all small  -> package name

MAHENDRASINGHDHONI -> all caps   -> constant
*/