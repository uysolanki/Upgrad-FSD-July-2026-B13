package day57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {

	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,3,4,5);
	
	//store the squares of all odd numbers in a seperate list
	
	List<Integer> squareOdOddNumbers=new ArrayList();
	
	for(int n:numbers)
	{
		if(n%2==1)
		{
			int square=n*n;
		
			squareOdOddNumbers.add(square);
		}
		
	}
	
	for(int n:squareOdOddNumbers)
	{
		System.out.println(n);
	}
	}
}
