package day1;

public class MyFirstJavaApp {
	
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