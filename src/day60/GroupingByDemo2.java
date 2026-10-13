package day60;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo2 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Shoyab", "Akshata", "Chetan", "Faizan", "Shahista", "Swaraj", "Atharva");
		
		Map<Character,List<String>> hashmap=
				words.stream()
				.collect(Collectors.groupingBy(word->word.charAt(0)));
		
		System.out.println(hashmap);
	}

}
