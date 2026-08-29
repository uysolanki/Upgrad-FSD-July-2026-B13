package day39;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student s1=new Student(18,"Alice",78.5);
		System.out.println(s1);
		
		Student s2=(Student)s1.clone();
		System.out.println(s2);
		
		System.out.println(s1==s2);  //false
		
		s2.setPer(99.9);
		System.out.println(s1.getPer());
	}
}
