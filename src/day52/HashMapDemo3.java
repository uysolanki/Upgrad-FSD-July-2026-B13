package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo3 {

	public static void main(String[] args) {
		 
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		int odd=0;
		int even=0;
		
		Map<String,Integer> hashmap=new HashMap();
		
		for(int n:numbers)
		{
			if(n%2==0)
				even++;
			else
				odd++;
		}
		
		hashmap.put("oddcount", odd);
		hashmap.put("evencount", even);
		
		System.out.println(hashmap);
	}
}
