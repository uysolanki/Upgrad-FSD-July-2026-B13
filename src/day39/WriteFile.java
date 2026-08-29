package day39;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		String fileName="myfolder/file3.txt";
		
		FileWriter fw=new FileWriter(fileName);
		fw.write("Virat Kohli");
		
		fw.close();
		System.out.println("Data written to file");
	}

}
