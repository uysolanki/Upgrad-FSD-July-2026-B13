package day35.turf.newturf;

import java.util.Scanner;

import day35.turf.PrintBill;

public class DriverApp {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	String customerName=sc.next();
	
	System.out.println("Enter Date of Play [dd-mm-yyyy]");
	String dateOfPlay=sc.next();
	
	System.out.println("Enter Time of Play [24 hour format]");
	String timeOfPlay=sc.next();
	
	System.out.println("Enter Time Number of hours");
	int numberOfHours=sc.nextInt();
	
	System.out.println("*** Turf Options ***");
	System.out.println("1. Cricket");
	System.out.println("2. Football");
	System.out.println("3. Tennis");
	System.out.println("0. Exit");
	
	int choice=sc.nextInt();
	if(choice==0)
	{ 
		System.out.println("Thank you for using our App");
		System.exit(0);
	}
		
	Turf turf=TurfManager.bookTurf(choice);
	PrintBill.billPrinting2(customerName,dateOfPlay,timeOfPlay,numberOfHours, turf);
}

}