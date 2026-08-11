package day27;

import java.util.Arrays;

public class LargestWordFromSentance {

	public static void main(String[] args) {
		
		String name="virat kohli plays cricket for rcb";   
		
		String words[]=name.split(" ");
		System.out.println("Number of words is "+ words.length); //["virat", "kohli", "plays", "cricket","for", "rcb"]
		
		int largestLength=0;
		String largestWord="";
		
		for(String word:words)		//word
		{							//virat
			if(word.length()>largestLength)
			{
				largestLength=word.length();
				largestWord=word;
			}
		}
		
		System.out.println("Largest word is "+largestWord);
		
		
	}

}
