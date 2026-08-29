package day40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccuranceOfWordInSingleLineFile {

	public static void main(String[] args) throws IOException {
		String fileName="myfolder/file2.txt";
		
		FileReader fw=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fw);
		String data=br.readLine();
		String searchedString="java";
		int startIndex=0;
		int index;
		int counter=0;
		do
		{
			 index= data.indexOf(searchedString,startIndex);
			 if(index!=-1)
			 {
				 counter++;
				 startIndex=index+searchedString.length();
			 }
		}while(index!=-1);
		
		System.out.println(searchedString +" appears "+ counter + " times");
		
		fw.close();
		br.close();
	}

}
