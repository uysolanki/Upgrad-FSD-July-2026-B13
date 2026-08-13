package day28;

public class LoginDriverApp {

	public static void main(String[] args) {
		Login l1=new Login();   //bunty
//		l1.setUsername("alice@gmail.com");
//		l1.setPassword("Alice@123");
		
//		System.out.println("Username is "+l1.getUsername());
//		System.out.println("Password is "+ l1.getPassword());
		
		
		Login l2=new Login();
		l2.setAtmPin(1234);
		System.out.println("My ATM Pin is "+ l2.getAtmPin());
		l2.height=5.8;
	}

}
