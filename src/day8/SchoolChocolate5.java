//each class has a quota of 20 chocolates, once the quota is reached stop the collection
//if any extra chocolates are collected return them back to the CT
//odd rollnumbers are boys, even rollnumbers are girls
//boys must bring chocolates in x 2, girls should bring chocolates in multiple 5
package day8;

import java.util.Scanner;

public class SchoolChocolate5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("What is the class strength");
	int total=sc.nextInt();
	int sum=0;
	int quota=20;
	for(int rno=1;rno<=total;rno++)														
	{		
		
		System.out.println("Rno  " + rno + " how many chocolates you have bought?");	
		int chocolate=sc.nextInt();	
			if( (rno%2==1  &&  chocolate%2==0)  ||  (rno%2==0  &&  chocolate%5==0)      )
				sum=sum+chocolate;	
		else
				continue;
		if(sum>=20)
			break;																	
	}																				
	System.out.println("Quota Reached, Total Extra chocolates "+ (sum-quota));									
}													
}													
//peon 0,10,18