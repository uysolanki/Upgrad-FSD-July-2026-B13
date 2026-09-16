package day53;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceInWord {

	public static void main(String[] args) {
		String sentance="java";
		
		Map<Character,Integer> hashmap=new HashMap();
		
		for(char key:sentance.toCharArray())	//word=little
		{
			if(hashmap.containsKey(key))
			{
				hashmap.put(key, hashmap.get(key)+1);
			}
			else
			{
				hashmap.put(key, 1);
			}
		}
		System.out.println(hashmap);
	}

}

/*
{
twinkle=2,
little=1
} 
*/

//{
//java=2
//is=1
//programming=1
//language=2
//i=2
//like=1
//speak=1
//marathi=1
//}


//{
//twinke=2
//little=1
//star=1
//how=2
//i=1
//wonder=1
//what=1
//you=1
//are=1
//}