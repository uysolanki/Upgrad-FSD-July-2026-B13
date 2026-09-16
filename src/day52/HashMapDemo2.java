package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import day42.Student;

public class HashMapDemo2 {

	public static void main(String[] args) {
		 
		
		Student s1=new Student(1,"Alice",78.5);
		Student s2=new Student(2,"Chris",88.5);
		Student s3=new Student(3,"Ben",98.5);
		List<Student> b13Students=new ArrayList(Arrays.asList(s1,s2,s3));
		
	
		Student s4=new Student(1,"Rajesh",78.6);
		Student s5=new Student(2,"Karan", 88.6);
		Student s6=new Student(3,"Arjun", 98.6);
		List<Student> b14Students=new ArrayList(Arrays.asList(s4,s5,s6));
		
		Map<String,List<Student>>  upgradFSD=new LinkedHashMap();
		
		upgradFSD.put("b13", b13Students);
		upgradFSD.put("b14", b14Students);
		System.out.println(upgradFSD);
		
		System.out.println(upgradFSD.get("b14").get(1).getStudentName());
		System.out.println(upgradFSD.get("b13").get(2).getStudentName());
		
		//{1,2,3,4,5}
		
	}
}
