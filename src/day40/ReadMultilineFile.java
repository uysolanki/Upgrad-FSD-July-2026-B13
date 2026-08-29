package day40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultilineFile {

	public static void main(String[] args) throws IOException {
		String fileName="myfolder/file2.txt";
		
		FileReader fw=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fw);
		String data="";
		while( (data=br.readLine())!=null)
		System.out.println(data);
		
		fw.close();
		br.close();
	}

}

//i like java it is easy java springboot