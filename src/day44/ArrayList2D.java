package day44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day42.Student;

public class ArrayList2D {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Alice",78.5);
		Student s2=new Student(2,"Chris",88.5);
		Student s3=new Student(3,"Ben",98.5);
		
		List<Student> fyStudents=new ArrayList<Student>();
		fyStudents.addAll(Arrays.asList(s1,s2,s3));
		System.out.println(fyStudents);
		
		
		Student s4=new Student(1,"Rajesh",78.6);
		Student s5=new Student(2,"Karan", 88.6);
		Student s6=new Student(3,"Arjun", 98.6);
		
		List<Student> syStudents=new ArrayList<Student>();
		syStudents.addAll(Arrays.asList(s4,s5,s6));
		System.out.println(syStudents);
		
		List<List<Student>> bca= new ArrayList();
		bca.add(fyStudents);
		bca.add(syStudents);
	}

}
