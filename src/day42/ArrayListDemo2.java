package day42;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList students=new ArrayList();
		students.add(new Student(1,"Alice",78.5));   //index 0
		students.add(new Student(2,"Ben",  88.5));   //index 1
		students.add(new Student(3,"Chris",98.5));   //index 2
		
//		students.add(10);
//		students.add("Apple");
//		
		System.out.println(students);

		
		//display name of the student at index 2
		
		Student stud=(Student)students.get(2);
		System.out.println(stud.getStudentName());
		
		//display name of all the students using traditional for loop
		for(int i=0;i<students.size();i++)
			System.out.println( ((Student) students.get(i)).getStudentName());
		
		
	}

}
