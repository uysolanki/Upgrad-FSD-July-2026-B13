package day54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength {

	public static void main(String[] args) {
		
		
		String sentence="silent listen note tone enot bca abc cab apple mango";
		String words[]=sentence.split(" ");
		
		
		Map<String,List<String>> hashmap   = new HashMap(); 
		
		for(String word:words)		//word="note"
		{
			char arr[]=word.toCharArray(); //['n', 'o', 't, 'e' ]
			Arrays.sort(arr);				//['e', 'n', 'o', 't' ]
			String key=new String(arr);     //"enot"
			hashmap.putIfAbsent(key, new ArrayList());
			
			hashmap.get(key).add(word);
		}
		
		System.out.println(hashmap.values());
	}
}


/*
{
"eilnst" = [silent,listen]
"enot" = [note]
}
 */