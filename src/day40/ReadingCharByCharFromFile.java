package day40;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingCharByCharFromFile {

	public static void main(String[] args) throws IOException {
		String fileName="myfolder/file4.txt";
		
		
		FileInputStream fis=new FileInputStream(fileName);
		int n;
		
		do
		{
			n=fis.read();
			if(n!=-1)
			System.out.println((char) n +  " : " +n);
		}while(n!=-1);
	}

}
//space=32
//newline=13
//tab=9