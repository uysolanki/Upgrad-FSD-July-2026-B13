package day57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo5 {

	public static void main(String[] args) {
	List<String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
	
//	months
//	.stream()
//	.filter(month-> month.length()>5)  //January","February","August","September","October","November","December"
//	.forEach(month->System.out.println(month));
	
	
//	//display name of months starting with 'J'
//	months.stream()
//	.filter(month->month.startsWith("J")) //January,June,July
//	.forEach(month->System.out.println(month));
	

//	//display name of months starting with 'J' and is greater than 5  
//	//solution 1
//	months.stream()
//	.filter(month->month.startsWith("J"))
//	.filter(month-> month.length()>5)
//	.forEach(month->System.out.println(month));
	
	//display name of months starting with 'J' and is greater than 5  
		//solution 1
		months.stream()
		.filter(month->month.startsWith("J") && month.length()>5)
		.forEach(month->System.out.println(month));
	}
	
	
	
}
