package day35.turf;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String customerName=sc.next();
		
		System.out.println("Enter Date of Play [dd-mm-yyyy]");
		String dateOfPlay=sc.next();
		
		System.out.println("Enter Time of Play [24 hour format]");
		String timeOfPlay=sc.next();
		
		System.out.println("*** Turf Options ***");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("0. Exit");
		
		int choice=sc.nextInt();
		
		System.out.println("Enter Time Number of hours");
		int numberOfHours=sc.nextInt();
		
		
		double totalAmount=0.0;
		String turfType="";
		switch(choice)
		{
		case 1 :  totalAmount=700*numberOfHours; turfType="Cricket"; break;
		case 2 :  totalAmount=1000*numberOfHours; turfType="Football";break;
		case 0 :  System.exit(0);
		}
		
		System.out.println("** ABC Turf **");
		System.out.println("Customer Name "+ customerName);
		System.out.println("Date of Play "+ dateOfPlay);
		System.out.println("Time of Play "+ timeOfPlay);
		System.out.println("Turf Type "+ turfType);
		System.out.println("Number of hours "+numberOfHours);
		System.out.println("Total Payable "+ totalAmount);

	}

}
