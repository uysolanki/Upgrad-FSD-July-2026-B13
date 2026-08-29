package day39;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrtWithResourcesDemo {

	public static void main(String[] args) throws IOException {
		String fileName="myfolder/file2.txt";
		
		try(
		FileReader fw=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fw);
		)
		{
		String data=br.readLine();
		
		System.out.println(data);
		}
		
		catch(Exception ex ) {}
	}

}
