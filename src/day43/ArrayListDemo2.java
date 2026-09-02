package day43;

import java.util.ArrayList;

import day42.Student;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList();  //homogenous
										//overhead eliminate
									    //explicit type casting not required
										//restriction : same type
		
	
		a1.add("Alice");
		a1.add("Ben");
		a1.add("Chris");
		
		String name=a1.get(1);
		
	

	}

}
