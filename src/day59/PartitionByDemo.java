package day59;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(6,12,16,28,32);				//>-20
		
		Map<Boolean,List<Integer>> hashmap=
				numbers.stream()
				.collect(Collectors.partitioningBy(n->n>=20));
		
		System.out.println(hashmap);

	}

}

/*
hashmap
{
true:[28,32]
false:[6,12,16]
*/