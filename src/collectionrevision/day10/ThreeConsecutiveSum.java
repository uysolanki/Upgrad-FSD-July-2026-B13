package collectionrevision.day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeConsecutiveSum {

	public static void main(String[] args) {
		
		Map<Integer,Integer> hashmap=new HashMap();
		List<Integer> numbers=Arrays.asList(8,2,3,7,3,0,7,2,3,9);
		for(int i=0;i<numbers.size()-2;i++)
		{
			hashmap.put(i, numbers.get(i)+numbers.get(i+1)+numbers.get(i+2));
		}
		System.out.println(hashmap);
		System.out.println(Collections.max(hashmap.values()));
	}

}
