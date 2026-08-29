package day39;

import java.io.File;

public class FileCreate {

	public static void main(String[] args) {
		File file=new File("myfolder");
		if(!file.exists())
		{
			file.mkdir();
			System.out.println("Folder created, pls refresh you app main folder");
		}
	}

}
