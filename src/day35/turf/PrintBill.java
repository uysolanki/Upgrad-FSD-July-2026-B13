package day35.turf;

import day35.turf.newturf.Turf;

public class PrintBill {

//	public static void billPrinting(String customerName, String dateOfPlay, String timeOfPlay, int numberOfHours, double totalAmount, String turfType)
//	{
//		System.out.println("** ABC Turf **");
//		System.out.println("Customer Name "+ customerName);
//		System.out.println("Date of Play "+ dateOfPlay);
//		System.out.println("Time of Play "+ timeOfPlay);
//		System.out.println("Turf Type "+ turfType);
//		System.out.println("Number of hours "+numberOfHours);
//		System.out.println("Total Payable "+ totalAmount);
//	}
	
//	public static void billPrinting(String customerName, String dateOfPlay, String timeOfPlay, int numberOfHours, double totalAmount, String turfType)
//	{
//		System.out.println("** ABC Turf **");
//		System.out.println(String.format("%-20s%-15s", "Customer Name ",customerName));
//		System.out.println(String.format("%-20s%-15s", "Date of Play ",dateOfPlay));
//		System.out.println(String.format("%-20s%-15s", "Time of Play ",timeOfPlay));
//		System.out.println(String.format("%-20s%-15s", "Turf Type ",turfType));
//		System.out.println(String.format("%-20s%d", "Number of Hours ",numberOfHours));
//		System.out.println(String.format("%-20s%.2f", "Total Payable ",totalAmount));
//	}

	public static void billPrinting2(String customerName, String dateOfPlay, String timeOfPlay, int numberOfHours,
			Turf turf) {
		System.out.println("** ABC Turf **");
		System.out.println(String.format("%-20s%-15s", "Customer Name ",customerName));
		System.out.println(String.format("%-20s%-15s", "Date of Play ",dateOfPlay));
		System.out.println(String.format("%-20s%-15s", "Time of Play ",timeOfPlay));
		System.out.println(String.format("%-20s%-15s", "Turf Type ",turf.getTurfName()));
		System.out.println(String.format("%-20s%d", "Number of Hours ",numberOfHours));
		System.out.println(String.format("%-20s%.2f", "Total Payable ",numberOfHours*turf.getTurfPrice()));
		
	}
}
