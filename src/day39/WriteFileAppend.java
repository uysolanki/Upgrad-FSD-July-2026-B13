package day39;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileAppend {

	public static void main(String[] args) throws IOException {
		String fileName="myfolder/file2.txt";
		
		FileWriter fw=new FileWriter(fileName,true);
		fw.append("Fullstack ");
		
		fw.close();
		System.out.println("Data written to file");
	}

}
