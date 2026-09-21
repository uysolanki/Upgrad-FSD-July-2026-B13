package collectionrevision.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
	
		
		List<String> names1=new ArrayList(Arrays.asList("Alice","Ben","Chris"));
		
		if(names1.contains("alice"))
			System.out.println("name found");
		else
			System.out.println("name not found");
		
		
		System.out.println(names1.size());		//3
		
		System.out.println(names1.isEmpty());  //false
		
		names1.clear();//size=0
		System.out.println(names1.size());		//0
		
		System.out.println(names1.isEmpty());  //true
		
	}

}
