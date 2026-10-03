package collectionrevision.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,List<String>> hashmap=new HashMap();
		hashmap.put(3, new ArrayList(Arrays.asList("one","two","six")));
		hashmap.put(4, new ArrayList(Arrays.asList("four","five")));
		hashmap.put(5, new ArrayList(Arrays.asList("seven","eight")));
		
		System.out.println(hashmap);

		
		//[[one, two, six], [four, five], [seven, eight]]
		
		System.out.println(hashmap.values());
		//p
		//  3 chars 3 String
		//  4 chars 2 String
		//  5 chars 2 String
		
		for(Entry<Integer,List<String>> entry:  hashmap.entrySet())
		{
			System.out.println(String.format("%d chars %d String", entry.getKey(), entry.getValue().size()));
		}
	}

}
