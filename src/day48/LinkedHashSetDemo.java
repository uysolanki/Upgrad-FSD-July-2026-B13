package day48;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> setA=new LinkedHashSet(Arrays.asList("Charlie","Alpha","Echo","Delta","Bravo",null));
		System.out.println(setA);
	}

}
