package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		List<String> mh = new ArrayList(Arrays.asList("Pune","Mumbai","Nagpur"));
		
		List<String> rj = new ArrayList(Arrays.asList("Jaipur","Bikaner","Fatehpur"));
	
		Student s1=new Student(1,"Alice",78.5);
		
		List<String> India=new ArrayList();
		India.addAll(mh);
		India.addAll(rj);
		
		System.out.println(mh);  //[p,m,n]
		System.out.println(rj);  //[j,b,f]
		System.out.println(India); //[p,m,n,j,b,f]
		
		System.out.println(mh.size());  //[]
		System.out.println(rj.size());  //[]
		System.out.println(India.size()); //[]
		
		//using mh display pune
		
		System.out.println(mh.get(0));
		
		//using India display pune
		System.out.println(India.get(0));
	}

}
