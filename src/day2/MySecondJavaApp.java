package day2;

public class MySecondJavaApp {
	
	public static void main(String[] args) {
		
		
		area(5); // function call
		area(7);
		area(9);
		area(13);

	}
										
	public static void area(int radius)  //function defination  aka  function body
	{
		double area=3.14*radius*radius;
		System.out.println("Area of Circle having radius " + radius + " is " + area); //39.25
	}
	
	public static void perimeterOfRectangle(int length, int width)  //function defination  aka  function body
	{
		
	}
	
}
















/*
public static void area(int radius)   //function prototype

function name : area
parameterised / non parameterised  : parameterised
count of parameters/arguments      : 1
*/