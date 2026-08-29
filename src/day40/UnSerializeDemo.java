package day40;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerializeDemo {

	public static void main(String[] args) throws IOException {
		UpgradStudent stud1=null;
		
		String fileName="myfolder/file5.txt";
		
		try(
		
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);)
		{
		
		stud1=(UpgradStudent)ois.readObject();
		
		System.out.println(stud1);
		}
		catch(Exception ex1) {
			ex1.printStackTrace();
		}
		
		

	}

}
