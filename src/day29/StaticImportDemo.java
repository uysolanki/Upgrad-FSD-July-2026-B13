package day29;

import java.util.Scanner;
import static java.lang.Math.*;

public class StaticImportDemo {

	public static void main(String[] args) {
//		int radius=5;
//		double area=3.14*radius*radius;
//		System.out.println("Property sold for " +area);
		
		Scanner sc=new Scanner(System.in);	
		int radius=5;
		double area=PI*radius*radius;
		System.out.println("Property sold for " +area);
		
		
				int jaipur=1000;
				int pune = 2300;

				//int dist=(pune-jaipur);
				int dist=abs(jaipur-pune);
				System.out.println(dist);
				
				System.out.println("Square root of 9 is "+sqrt(9.0));
	}

}
