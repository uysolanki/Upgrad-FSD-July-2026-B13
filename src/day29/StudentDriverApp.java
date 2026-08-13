package day29;

public class StudentDriverApp {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s2.acceptStudent();
		s1.acceptStudent();
		s3.acceptStudent();
		
		
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
	}

}
