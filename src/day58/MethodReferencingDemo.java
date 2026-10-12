package day58;

import java.util.Arrays;
import java.util.List;

public class MethodReferencingDemo {

	public static void main(String[] args) {
		List<String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
		
//		//display names of months in capital letters of months whose length>5  
//		months
//		.stream()
//		.filter(month-> month.length()>5)  //January","February","August","September","October","November","December"
//		.map(month->month.toUpperCase())
//		.forEach(month->System.out.println(month));
		
		
		months
		.stream()
		.filter(MethodReferencingDemo::checkStringLengthGreaterThan5)  //January","February","August","September","October","November","December"
		.map(String::toUpperCase)
		.forEach(System.out::println);

	}

	public static boolean checkStringLengthGreaterThan5(String str)
	{
		if(str.length()>5)
			return true;
		else
			return false;
	}
}
