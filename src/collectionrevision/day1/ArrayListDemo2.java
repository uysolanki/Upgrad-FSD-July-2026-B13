package collectionrevision.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
//		ArrayList names=new ArrayList();
//		ArrayList<String> names1=new ArrayList();
//		List<String> names=Arrays.asList("Alice","Ben","Chris");
//		System.out.println(names);
//		names.add("David");
//		System.out.println(names);
		
		
		List<String> names1=new ArrayList(Arrays.asList("Alice","Ben","Chris"));
		System.out.println(names1);
		names1.add("David");
		System.out.println(names1);
	}

}
