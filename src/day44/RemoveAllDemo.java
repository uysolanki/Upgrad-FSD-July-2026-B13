package day44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day43.Student;

public class RemoveAllDemo {

	public static void main(String[] args) {
		List<String> mh = new ArrayList(Arrays.asList("Pune","Mumbai","Nagpur"));
		
		List<String> rj = new ArrayList(Arrays.asList("Jaipur","Bikaner","Fatehpur"));
		
		List<String> gj = new ArrayList(Arrays.asList("Surat","Ahmedabad","Vapi"));
	
		Student s1=new Student(1,"Alice",78.5);
		
		List<String> India=new ArrayList();
		India.addAll(mh);
		India.addAll(rj);
		India.addAll(gj);
		
		mh.add("Satara");
		System.out.println(India);
		
//		India.removeAll(mh);
//		System.out.println(India);
		
//		India.retainAll(mh);
//		System.out.println(India);
		
		System.out.println(India.containsAll(mh));
		
		int index=mh.indexOf("Lonavla");
		System.out.println(index);	
	}
}
//pno pname matchesplayed runscored cathestaken wicketstaken trophieswon country