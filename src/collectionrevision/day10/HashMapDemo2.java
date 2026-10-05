package collectionrevision.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<String,List<Student>> upgrad=new HashMap();
		
		Student s1=new Student(1,"Alice",78.5);
		Student s2=new Student(2,"Ben",78.5);
		Student s3=new Student(3,"Chris",78.5);
		
		
		Student s4=new Student(4,"David",68.5);
		Student s5=new Student(5,"Frank",88.5);
		Student s6=new Student(6,"George",98.5);
		
		List<Student> mitCollege=new ArrayList(Arrays.asList(s1,s2,s3));
		List<Student> dyPatil=new ArrayList(Arrays.asList(s4,s5,s6));
		
		upgrad.put("batch13", mitCollege);
		upgrad.put("batch14", dyPatil);
		
	
		//search in mit do i have a student named SearchedName   //output : Found
		int flag=0;
//		String searchName="Ben";
		String searchName="Frank";
		for(Student student : mitCollege)
		{
			if (student.getStudentName().equalsIgnoreCase(searchName))
			{
				System.out.println("Student found with name "+searchName);
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Student not found with name "+searchName);
		
		
		
		//search in upgrad do i have a student named SearchedName   //output : Found
	}

}
