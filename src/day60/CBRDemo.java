package day60;

public class CBRDemo {

	public static void main(String[] args) {
		Student s1=new Student(18,"Virat",78.5);
		System.out.println(s1.getRno());
		test(s1);
		System.out.println(s1.getRno());
	}

	private static void test(Student s2) {
		s2.setRno(99);
		
	}

}

//if i modify value of b will it also modify the value of a?
//yes 
//No
