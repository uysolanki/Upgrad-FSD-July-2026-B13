package day40;

import java.io.FileInputStream;
import java.io.IOException;

public class WordCountInFile {

	public static void main(String[] args) throws IOException {
		String fileName="myfolder/file3.txt";
		
		
		FileInputStream fis=new FileInputStream(fileName);
		int n;
		int counter=0;
		do
		{
			n=fis.read();
			if(n==32)
			counter++;
		}while(n!=-1);
		
		System.out.println("Number of words are " +  ++counter);
	}

}
