package collectionrevision.day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
//		ArrayList names=new ArrayList();
//		ArrayList<String> names1=new ArrayList();
		List<String> names=new ArrayList();
		
		names.add("Alice");
		names.add(null);
		names.add("Alice");
		names.add("Chris");
		names.add("Ben");
		names.add(null);
		names.add("Frank");
		
		
		names.add(null);
		names.add(null);
		
		System.out.println(names);
		
		names.add("George");
		System.out.println(names);

	}

}
