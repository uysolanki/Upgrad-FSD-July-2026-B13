package day37;

import java.util.Scanner;


public class NameRegistrationApp2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        try {
        	 checkNameValidness(firstName);   
             System.out.println("Form Submitted");
            
        } catch(InValidNameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

	}

	private static void checkNameValidness(String firstName) throws InValidNameException
	{
		if (!firstName.matches("[A-Za-z]+")) 
            throw new InValidNameException("Invalid name! Name should contain only alphabets.");
	}
}
