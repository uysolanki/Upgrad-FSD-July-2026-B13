package day53;

import java.util.HashMap;
import java.util.Map;

public class WordOccuranceInSentance2 {

	public static void main(String[] args) {
		String sentance="java is programming language i like java i speak marathi language";
		//String sentance="twinkle twinkle little star how i wonder what you are";
		
		Map<String,Integer> hashmap=new HashMap();
		
		String words[]=sentance.split(" "); //["twinkle", "twinkle", "little", "star", how i wonder what you are"];
		
		for(String word:words)	//word=twinkle
			hashmap.put(word, hashmap.getOrDefault(word, 0)+1);
		
		System.out.println(hashmap);
	}

}

/*
{
twinkle=2
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