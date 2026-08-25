package day37;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class NameRegistrationApp {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        try {
        	if (!firstName.matches("[A-Za-z]+")) 
                throw new InvalidNameException("Invalid name! Name should contain only alphabets.");
                
                System.out.println("Form Submitted");
            
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

       
        sc.close();

	}
}
