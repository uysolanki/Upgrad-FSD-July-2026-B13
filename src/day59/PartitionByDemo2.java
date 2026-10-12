package day59;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo2 {

	public static void main(String[] args) {
		List<String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
					//length>=5
		
		Map<Boolean,List<String>> hashmap=
				
		months.stream()
		.collect(Collectors.partitioningBy(m->m.length()>5));
		
		System.out.println(hashmap.get(true).size());

	}

}

/*
hashmap
{
true:[January","February","August","September","October","November","December"]
false:["March","April","May","June","July"]
*/