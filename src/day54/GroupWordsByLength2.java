package day54;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupWordsByLength2 {

	public static void main(String[] args) {
		
		
		String sentence="silent listen listen note tone enot bca abc cab apple mango";
		String words[]=sentence.split(" ");
		
		
		Map<String,Set<String>> hashmap   = new HashMap(); 
		
		for(String word:words)		//word="note"
		{
			char arr[]=word.toCharArray(); //['n', 'o', 't, 'e' ]
			Arrays.sort(arr);				//['e', 'n', 'o', 't' ]
			String key=new String(arr);     //"enot"
			hashmap.putIfAbsent(key, new HashSet());
			
			hashmap.get(key).add(word);
		}
		
		System.out.println(hashmap.values());
		
		for(Set<String> groups:hashmap.values())
			System.out.println(groups);
	}
}


/*
{
"eilnst" = [silent,listen]
"enot" = [note]
}
 */