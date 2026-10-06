package day57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo4 {

	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,3,4,5);
	
	//store the squares of all odd numbers in a seperate list
	
	int result=numbers
	.stream()                               //initiator
	.filter(n->n%2==1)   //1,3,5			
	.map(n->n*n) 		 //1,9,25
	.reduce(0,(acc,n)->acc+n);
	
	System.out.println(result);

	}
}
