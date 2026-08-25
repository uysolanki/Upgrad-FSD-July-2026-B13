package day37;

import java.util.Scanner;

public class WholesalerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter quantity");
		int qty=sc.nextInt();
		
		try
		{
		if(qty<500)
		throw new InValidQuantityException("Please enter qty > 500");
		
		System.out.println("Order accepted");
		
		}
		catch(InValidQuantityException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		finally
		{
			System.out.println("Thank You!!, Visit Again");
		}
	}

}
