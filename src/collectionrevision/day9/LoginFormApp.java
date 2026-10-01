package collectionrevision.day9;

import java.util.Scanner;

public class LoginFormApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
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
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Username");
		}
	

	}

}
