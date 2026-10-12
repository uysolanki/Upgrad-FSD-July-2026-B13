package day57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumberFromArray {

	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,13,4,5);
	
	int max=numbers
	.stream() 
	.mapToInt(n->(int)n)
	.max()
	.orElse(0);
	
	System.out.println(max);
	

	}
}
