package day39;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		String fileName="myfolder/file1.txt";
		
		FileWriter fw=new FileWriter(fileName);
		fw.write("Fullstack");
		
		fw.close();
		System.out.println("Data written to file");
	}

}
