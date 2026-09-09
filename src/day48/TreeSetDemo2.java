package day48;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Set<Student> resultPublish=new TreeSet(new PerComparator());   //desc order of percentage


		resultPublish.add(new Student(1,"Alice",78.5));
		resultPublish.add(new Student(2,"Tom",98.5));
		resultPublish.add(new Student(3,"Ben",88.5));

		System.out.println("Results");
		System.out.println(resultPublish);
		
		
		
		Set<Student> attendance=new TreeSet(new RnoComparator());			//Asc order of rno
		 attendance.add(new Student(1,"Alice",78.5));
		 attendance.add(new Student(2,"Tom",98.5));
		 attendance.add(new Student(3,"Ben",88.5));
		 
		 System.out.println("Attendance");
		 System.out.println(attendance);
		 
		Set<Student> examSeating=new TreeSet(new NameComparator());     //Asc order of name
		examSeating.add(new Student(1,"Alice",78.5));
		examSeating.add(new Student(2,"Tom",98.5));
		examSeating.add(new Student(3,"Ben",88.5));
		
		System.out.println("Exams Seatings");
		System.out.println(examSeating);

	}

}
