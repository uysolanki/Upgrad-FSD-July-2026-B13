package day48;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> setA=new HashSet(Arrays.asList(1,2,3,4,5));
		System.out.println(setA);
		Set<Integer> setB=new HashSet(Arrays.asList(4,5,6,7,8));
		System.out.println(setB);
		
		//AUB
//		setA.addAll(setB);
//		System.out.println("AUB=" + setA);
		
		
		//AnB
		setA.retainAll(setB);
		System.out.println("AnB=" + setA);
	}

}
