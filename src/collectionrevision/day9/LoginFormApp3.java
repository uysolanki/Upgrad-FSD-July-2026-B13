package collectionrevision.day9;

import java.util.Scanner;

public class LoginFormApp3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MyError2 error=null;
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
				error=MyError2.ERR02;
				System.out.println(error.getErrorName());
			}
		}
		else
		{
			error=MyError2.ERR01;
			System.out.println(String.format(error.getErrorName(),username));  //%s is not a valid Username
		}
	

	}

}
