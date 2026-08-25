package day37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeDecorationApp {

	public static void main(String[] args) {
		
		try
		{
		double carpetCost=calculateTotalCarpetCost();
		System.out.println("Total Expenses of Carpet is "+carpetCost);
		}
		catch(RuntimeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	private static double calculateTotalCarpetCost() throws RuntimeException
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter per sq ft carper cost");		//1000
		int carpetSqftCost=sc.nextInt();
		
		Room room=null;
		
		System.out.println("Enter length of room");		//1000
		int length=sc.nextInt();
		System.out.println("Enter Width of room");		//1000
		int width=sc.nextInt();
		//room=new Room(length,width);
		return room.calculateArea()*carpetSqftCost;
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Log : Message for Developer Please enter valid integer values only");
			throw new RuntimeException("Message for Customer , Pls try after sometime");
		}
		catch(NullPointerException ex)
		{
			ex.printStackTrace();
			throw new RuntimeException("Message for Customer , Pls try after sometime");
		}
	}

}
