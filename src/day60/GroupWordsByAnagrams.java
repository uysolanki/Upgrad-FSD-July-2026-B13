package day60;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupWordsByAnagrams {

	public static void main(String[] args) {
		
		
		String sentence="silent listen listen note tone enot bca abc cab apple mango";
		String words[]=sentence.split(" ");
		System.out.println(Arrays.toString(words));
		
		Map<String,Set<String>> hashmap   = new HashMap(); 
		
		for(String word:words)		//word="silent"
		{
			char arr[]=word.toCharArray(); //['l', 'i', 's', 't', 'e', 'n' ]
			Arrays.sort(arr);				//['e', 'i', 'l', 'n' , 's' ,'t']
			String key=new String(arr);     //"eilnst"
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
"eilnst" = [silent,listend]
"enot" = [note]
}
 */