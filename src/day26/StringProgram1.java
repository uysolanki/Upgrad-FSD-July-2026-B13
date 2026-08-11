package day26;

import java.util.Arrays;

public class StringProgram1 {

	public static void main(String[] args) {
		String name="virat kohli";   //"virat kohli"
		//count of vowels
		
		char arr[]=name.toCharArray();  //['v'  'i'  'r'  'a'   't'   '  '   'k'  'o'  'h'  'l'  'i' ]
		
		System.out.println(Arrays.toString(arr));
		int counter=0;
		for(char ch:arr)
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
			{
				counter++;
			}
		}
		
		System.out.println(counter);

	}

}
