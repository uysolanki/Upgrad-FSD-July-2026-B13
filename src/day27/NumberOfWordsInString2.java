package day27;

import java.util.Arrays;

public class NumberOfWordsInString2 {

	public static void main(String[] args) {
		
		String name="virat kohli plays cricket for rcb";   
		
		String words[]=name.split(" ");
		System.out.println("Number of words is "+ words.length);
	}

}
