package day57;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,13,4,5);
		
		int ans=numbers
		.stream()
		.reduce(0,(acc,n)->acc+n);
		
		System.out.println(ans);
	}

}
