package day27;

import java.util.Arrays;

public class LargestWordFromSentance2 {

	public static void main(String[] args) {
		
		String name="virat,kohli,plays,cricket,for,rcb";   
		                                //  0     1     2     3       4  5
		String words[]=name.split(","); //["virat",kohli,plays,cricket,for,rcb]
		
		String largest=findLargestWord(words);
		String smallest=findSmallestWord(words);
		System.out.println("Largest word is "+largest);
		System.out.println("Smallest word is "+smallest);
		
		
	}

	private static String findSmallestWord(String[] words) {
		int smallestLength=words[0].length();
		String smallestWord=words[0];
		
		for(String word:words)		//word
		{							//virat
			if(word.length()<smallestLength)
			{
				smallestLength=word.length();
				smallestWord=word;
			}
		}
		return smallestWord;
	}

	private static String findLargestWord(String[] words) {
		int largestLength=words[0].length();                      //largestLength      LargestWord
		String largestWord=words[0];									   //7         Cricket
		
		for(String word:words)		//word
		{							//cricket
			if(word.length()>largestLength)
			{
				largestLength=word.length();
				largestWord=word;
			}
		}
		return largestWord;
	}

}
