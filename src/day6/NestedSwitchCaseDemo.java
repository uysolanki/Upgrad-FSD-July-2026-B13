package day6;

import java.util.Scanner;

public class NestedSwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**Choose Language**");
		System.out.println("1. English");
		System.out.println("2. Arabic");
	
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: 	System.out.println("**Choose Ascent**");
					System.out.println("1. UK English");
					System.out.println("2. US English");
					System.out.println("3. AUS English");
					System.out.println("Enter your choice");
					choice=sc.nextInt();
					switch(choice)
					{
					case 1 : System.out.println("Call routed to London"); break;
					case 2 : System.out.println("Call routed to New York"); break;
					case 3 : System.out.println("Call routed to Sydney"); break;
					default : System.out.println("Invalid Input");
					}
			
		break;
		case 2: System.out.println("**Choose Ascent**");
				System.out.println("1. Oman Arabic");
				System.out.println("2. Qatar Arabic");
				System.out.println("3. UAE Arabic");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1 : System.out.println("Call routed to Muscat"); break;
				case 2 : System.out.println("Call routed to Doha"); break;
				case 3 : System.out.println("Call routed to Dubai"); break;
				default : System.out.println("Invalid Input");
				}
		
		
		break;
		default:System.out.println("Call disconnected");
		}
	}

}
