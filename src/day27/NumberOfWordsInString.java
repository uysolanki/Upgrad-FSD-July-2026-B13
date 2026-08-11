package day27;

import java.util.Arrays;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		//String name="virat kohli";   //"virat kohli"
		String name="virat kohli plays for rcb";   //"virat kohli"
		System.out.println("Number of chars is "+name.length());
		
		int wordCounter=1;
		for(char ch:name.toCharArray())
		{
			if(ch== ' ')
				wordCounter++;
		}
		
		System.out.println("Number of words is "+(wordCounter));

	}

}
