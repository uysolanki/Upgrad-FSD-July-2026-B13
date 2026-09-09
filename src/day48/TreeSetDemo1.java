package day48;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		Set<Student> a1=new TreeSet();  


		a1.add(new Student(1,"Alice",78.5));
		a1.add(new Student(2,"Tom",98.5));
		a1.add(new Student(3,"Ben",88.5));

		System.out.println(a1);

	}

}
