package collectionrevision.day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeConsecutiveSum2 {

	public static void main(String[] args) {
		
		Map<Integer,Integer> hashmap=new HashMap();
		List<Integer> numbers=Arrays.asList(8,2,9,9,9,0,7,6,8,9);
		for(int i=0;i<numbers.size()-2;i++)
		{
			if((numbers.get(i)!=numbers.get(i+1) && numbers.get(i)!=numbers.get(i+2)) && numbers.get(i+1)!=numbers.get(i+2))
			{
			int sum=numbers.get(i)+numbers.get(i+1)+numbers.get(i+2);
			hashmap.put(i,sum );
			}
		}
		System.out.println(hashmap);
		System.out.println(Collections.max(hashmap.values()));
	}

}

//array hardcode {8,2,9,9,9,0,7,6,8,9}
//n=3