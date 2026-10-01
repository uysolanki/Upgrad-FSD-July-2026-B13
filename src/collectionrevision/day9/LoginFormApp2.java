package collectionrevision.day9;

import java.util.Scanner;

public class LoginFormApp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MyError error=null;
		System.out.println("Enter username");
		String username=sc.next();
		if(username.length()>=6)
		{
			System.out.println("Enter password");
			String password=sc.next();
			if(password.length()>=8)
			{
				System.out.println("Login Successfull");
			}
			else
			{
				error=MyError.ERR02;
				System.out.println(error.getErrorName());
			}
		}
		else
		{
			error=MyError.ERR01;
			System.out.println(error.getErrorName());
		}
	

	}

}
