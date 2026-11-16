package day60;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo5 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("silent", "listen","note", "tone", "enot", "bca", "abc", "cab", "apple");
		
		Map<String,List<String>> hashmap=
				words.stream()
				.collect(Collectors.groupingBy(
						word->{
							char arr[]=word.toCharArray();
							Arrays.sort(arr);
							return new String(arr);
						}
						));
		
		System.out.println(hashmap);
				
				

	}

}
