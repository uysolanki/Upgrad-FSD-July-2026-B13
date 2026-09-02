package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		
		
//		List<String> a1 =Arrays.asList("Apple","Mango","Banana");
//	    a1.add("Pineapple");

	    
	    List<String> a2=new ArrayList(Arrays.asList("Apple","Mango","Banana"));
	    System.out.println(a2);
	    a2.add("Pineapple");
	    System.out.println(a2);
	    
	}

}
