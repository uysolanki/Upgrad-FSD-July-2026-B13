package day42;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList();
		
		names.add("Alice");
		names.add("Ben");
		names.add("Chris");
		
		String searchedName="Tom";
		if(names.contains(searchedName))
			System.out.println(searchedName + " Found");
		else
			System.out.println(searchedName + " Not Found");
		
		
	}

}
