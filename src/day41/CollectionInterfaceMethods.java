package day41;

import java.util.ArrayList;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList();
		a1.add("Alice");
		a1.add("Ben");
		a1.add("Chris");
		
		System.out.println(a1);
		a1.add("David");
		System.out.println(a1);
		
		a1.add(1, "John");
		
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		System.out.println(a1.isEmpty());
		
		System.out.println(a1.contains("Chris"));
		
		a1.clear();
		System.out.println(a1.isEmpty());
		

	}

}
