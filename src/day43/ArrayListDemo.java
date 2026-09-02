package day43;

import java.util.ArrayList;

import day42.Student;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();  //heterogenous
										//overhead extra expenses
									    //explicit type casting
		
		a1.add(1);
		a1.add("Alice");
		a1.add(true);
		a1.add(new Student(1,"Alice",78.5));
		
		String name=(String)a1.get(1);
		
		Student stud1=(Student)a1.get(3);
		
		System.out.println(   ((Student)   a1.get(3)).getStudentName()  );
		

	}

}
