package day39;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerializeDemo {

	public static void main(String[] args) throws IOException {
		Student stud1=null;
		
		String fileName="myfolder/file5.txt";
		
		try(
		
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);)
		{
		
		stud1=(Student)ois.readObject();
		
		System.out.println(stud1);
		}
		catch(Exception ex1) {
			ex1.printStackTrace();
		
		}

	}

}
