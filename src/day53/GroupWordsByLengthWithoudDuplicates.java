package day53;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupWordsByLengthWithoudDuplicates {

	public static void main(String[] args) {
		
		
		String sentence="one one two three four five six seven eight nine ten";
		String words[]=sentence.split(" ");
		System.out.println(Arrays.toString(words));
		
		Map<Integer,Set<String>> hashmap   = new HashMap(); 
		
		for(String word:words)		//word="one"
		{
			int key=word.length();  //key=3;
			hashmap.putIfAbsent(key, new HashSet());
			
			hashmap.get(key).add(word);
		}
		
		System.out.println(hashmap.values());
	}
}


/*
{
3=[one]

[[one, one, two, six, ten],[four, five, nine],[three, seven, eight]]
}
 */