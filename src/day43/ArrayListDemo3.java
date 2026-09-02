package day43;

import java.util.ArrayList;

import day42.Student;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList();  //homogenous
										//overhead eliminate
									    //explicit type casting not required
										//restriction : same type
		
	
		a1.add(new Student(1,"Alice",78.5));
		a1.add(new Student(2,"Chris",88.5));
		a1.add(new Student(3,"Ben",98.5));
		
		
		System.out.println(a1.get(0).getStudentName());
		
	

	}

}
