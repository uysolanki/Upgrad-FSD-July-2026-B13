package day48;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<String> setA=new HashSet(Arrays.asList("Alpha","Bravo","Charlie","Delta","Echo","Delta","Delta",null,null,null));
		System.out.println(setA);
	}

}
