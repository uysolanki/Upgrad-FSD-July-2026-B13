package day60;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
		
		Map<Integer,List<String>> hashmap=
				words.stream()
				.collect(Collectors.groupingBy(word->word.length()));
		
		System.out.println(hashmap);
	}

}
