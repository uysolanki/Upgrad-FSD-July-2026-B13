package day19;

import java.util.Scanner;

public class CurrencyExchange2 {

	public static void main(String[] args) {
		
		int currency[]= {500,200,100,50,20,10};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the exchange amount");
		int amount=sc.nextInt();
		
		calculateExchange(currency,amount);

	}

	private static void calculateExchange(int[] currency, int amount) {
		
		int notes[]= new int[currency.length];
												//6750   is 6750>0 Tr
			for(int i=0;i<currency.length;i++)	//250
			{									//50
					if(amount>0)
					{
					notes[i]=amount/currency[i];
					amount=amount%currency[i];
					}
					else
					{
						break;
					}
			}
			
			int sum=0;
			for(int i=0;i<currency.length;i++)	//250
			{
				if(notes[i]!=0)
				{
				System.out.println(currency[i] + " X " + notes[i]);
				sum+=notes[i];
				}
			}
			
			System.out.println("Total Notes "+sum);
		
	}

}
