package collectionrevision.day10;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharInAString {

	public static void main(String[] args) {
		//String str1="apple";
		String str1="upgrad";
		
		Set<Character> hashset=new HashSet();
		int flag=0;
		for(char ch:str1.toCharArray())
		{
			if(!hashset.add(ch))
			{
				System.out.println(ch);
				flag=1;
				break;
			}		
		}
		
		if(flag==0)
			System.out.println("No Char found");

	}

}


//hashset=[]

//ch ='a'   		hashset.add('a') true
//ch ='p'			hashset.add('p') true
//ch ='p'			hashset.add('p') false