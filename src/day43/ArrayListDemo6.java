package day43;

import java.util.ArrayList;
import java.util.Arrays;

import day42.Student;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		 
		Student s1=new Student(1,"Alice",78.5);
		Student s2=new Student(2,"Chris",88.5);
		Student s3=new Student(3,"Ben",98.5);
		
		ArrayList<Student> a1=new ArrayList(Arrays.asList(s1,s2,s3));
		
		System.out.println(a1.get(1).getStudentName());
		
		
	}

}
