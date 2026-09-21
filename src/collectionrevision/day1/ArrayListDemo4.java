package collectionrevision.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
	
		
		List<Student> batch13=new ArrayList();
		
		Student s1=new Student(1,"Aryavir",78.5);
		Student s2=new Student(2,"Anvay",88.5);
		Student s3=new Student(3,"Vaibhav",98.5);
		
		batch13.add(s1);
		batch13.add(s2);
		batch13.add(s3);
		
		List<Student> batch14=new ArrayList(Arrays.asList(s1,s2,s3));
		
		List<Student> batch15=new ArrayList();
		batch15.addAll(Arrays.asList(s1,s2,s3));
		
		System.out.println(batch13);
		System.out.println(batch14);
		System.out.println(batch15);
		
		//display Aryavir using batch13 variable
		
		System.out.println(batch13.get(0).getStudentName());
		
		
		Student student=new Student(18,"Virat",78.5);
		//Student student=new Student(3,"Vaibhav",98.5);
		int index=batch13.indexOf(student);
		System.out.println(index);
	}

}
