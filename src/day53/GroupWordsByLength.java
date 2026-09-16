package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength {

	public static void main(String[] args) {
		
		
		String sentence="one one two three four five six seven eight nine ten";
		String words[]=sentence.split(" ");
		System.out.println(Arrays.toString(words));
		
		Map<Integer,List<String>> hashmap   = new HashMap(); 
		
		for(String word:words)		//word="one"
		{
			int key=word.length();  //key=3;
			hashmap.putIfAbsent(key, new ArrayList());
			
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