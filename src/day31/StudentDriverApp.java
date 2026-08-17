package day31;

public class StudentDriverApp {

	public static void main(String[] args) {
		Student s1=new Student();   //0 null 0.0
		
		
		Student s2=new Student();
		
		Student s3=new Student();
		
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		System.out.println("*****");
		Student s4=new Student(18,"Sushmita",98.6);
		s4.displayStudent();
		
		Student s5=new Student(s4);
		s5.displayStudent();

	}

}
