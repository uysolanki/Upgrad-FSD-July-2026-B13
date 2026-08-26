package day38;

public class StudentDriver {

	public static void main(String[] args) {
		try
		{
		Student s1=new Student(18,"Virat",78.5);
		System.out.println(s1);
		
		Student s2=new Student(18,null,78.5);
		System.out.println(s2);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Please enter valid details while creating student object");
		}

	}

}
