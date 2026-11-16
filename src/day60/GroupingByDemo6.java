package day60;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo6 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("silent", "listen","note", "tone", "enot", "bca", "abc", "cab", "apple");
		
		Map<String,List<String>> hashmap=
				words.stream()
				.collect(Collectors.groupingBy(
						GroupingByDemo6::getKey
						));
		
		System.out.println(hashmap.values());
				
				

	}
	
	public static String getKey(String word)
	{
		char arr[]=word.toCharArray(); //['l', 'i', 's', 't', 'e', 'n' ]
		Arrays.sort(arr);				//['e', 'i', 'l', 'n' , 's' ,'t']
		String key=new String(arr);     //"eilnst"
		return key;
	}

}
