package day28;

public class LoginDriverApp {

	public static void main(String[] args) {
		Login l1=new Login();   //bunty
		l1.setUsername("alice@gmail.com");
		l1.setPassword("Alice@123");
		
		System.out.println("Username is "+l1.getUsername());
		System.out.println("Password is "+ l1.getPassword());

	}

}
