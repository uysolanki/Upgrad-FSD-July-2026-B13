package day19;

import java.util.Scanner;

public class CurrencyExchange4 {

	public static void main(String[] args) {
		
		int currency[]= {500,200,100,50,20,10};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the exchange amount");
		int amount=sc.nextInt();
		
		calculateExchange(currency,amount);

	}

	private static void calculateExchange(int[] currency, int amount) {
		
		int notes[]= new int[currency.length];
		int sum=0;									//6750   is 6750>0 Tr
			for(int i=0;i<currency.length;i++)	//250
			{									//50
					if(amount>9)
					{
					notes[i]=amount/currency[i];
					sum+=notes[i];
					amount=amount%currency[i];
					
					if(notes[i]!=0)
					System.out.println(currency[i] + " X " + notes[i]);
					}
					else
					{
						break;
					}
			}
			
			
			
			
			System.out.println("Total Notes "+sum);
			System.out.println("Changes "+amount);
		
	}

}
