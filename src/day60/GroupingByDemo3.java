package day60;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo3 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Shoyab", "Akshata", "Chetan", "Faizan", "Shahista", "Swaraj", "Atharva");
		
		Map<Character,Long> hashmap=
				words.stream()
				.collect(Collectors.groupingBy(word->word.charAt(0),Collectors.counting()));
		
		System.out.println(hashmap);
		
		// the char which has the maximum count
		char key=hashmap.entrySet().stream()
		.max(Map.Entry.comparingByValue())  //{S=3} -> S
		.map(Map.Entry::getKey)
		.orElse(null);
		
		System.out.println(key);
	}

}
