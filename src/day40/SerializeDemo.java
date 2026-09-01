package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		UpgradStudent stud1=new UpgradStudent(444,"Bravo",98.7);
		System.out.println(stud1);
		
		String fileName="myfolder/file5.txt";
		
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(stud1);
		
		System.out.println("Object written to file successfully");
		
		fos.close();
		oos.close();

	}

}
