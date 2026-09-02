package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo8 {

	public static void main(String[] args) {
		List<String> mh = new ArrayList(Arrays.asList("Pune","Mumbai","Nagpur"));
		
		List<String> rj = new ArrayList(Arrays.asList("Jaipur","Bikaner","Fatehpur"));
	
		Student s1=new Student(1,"Alice",78.5);
		
		List<List<String>> India=new ArrayList();
		India.add(mh);
		India.add(rj);
		
		System.out.println(mh);  //[]
		System.out.println(rj);  //[]
		System.out.println(India); // [[],[]]
		
		System.out.println(mh.size());  //3
		System.out.println(rj.size());  //3
		System.out.println(India.size()); //2
		
		//using mh display Pune
		
		System.out.println(mh.get(0));
				
		//using India display Pune
		System.out.println(India.get(0).get(0));
		
		//using India display Fatehpur
		System.out.println(India.get(1).get(2));
	}

}
