package day59;

import java.util.Arrays;
import java.util.List;

public class MethodRefercingDemo {

	public static void main(String[] args) {
		List<String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
		
		//input : ["January","February","March","April","May","June","July","August","September","October","November","December"]
		//output :[7,         8,        5,       5,      3,    4,     4,     6,       9,          7,        8,         8
		//display all the month names in capital letters
		
//		months.stream()
//		.map(month->month.toUpperCase())
//		.forEach(month->System.out.println(month));
		
		
//		months.stream()
//		.map(String::toUpperCase)
//		.forEach(month->System.out.println(month));
		
		
//		months.stream()
//		.map(month->month.length())
//		.forEach(monthLen->System.out.println(monthLen));
		
//		months.stream()
//		.map(MethodRefercingDemo::getUpgradFSDLengthOfString)
//		.forEach(monthLen->System.out.println(monthLen));
		
		months.stream()
		.map(String::length)
		.forEach(monthLen->System.out.println(monthLen));
	}
	
	public static int getUpgradFSDLengthOfString(String str)
	{
		return str.length();
	}
	
}
