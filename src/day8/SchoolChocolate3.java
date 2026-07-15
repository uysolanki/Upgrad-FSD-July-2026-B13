//each class has a quota of 20 chocolates, once the quota is reached stop the collection
//if any extra chocolates are collected return them back to the CT
package day8;

import java.util.Scanner;

public class SchoolChocolate3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int sum=0;
	int quota=20;
	for(int rno=1;rno<=5;rno++)														//sum	rno					chocolate        output
	{																				//0		1    is 1<=5 true	3
		System.out.println("Rno  " + rno + " how many chocolates you have bought?");	//3     2    is 2<=5 true   10
		int chocolate=sc.nextInt();													//13    3    is 3<=5 true   5
		sum=sum+chocolate;	
		if(sum>=20)
			break;																		//18    4    is 4<=5 true   1
	}																				//19    5    is 5<=5 true   0
	System.out.println("Total Extra chocolates "+ (sum-quota));									//19    6    is 6<=5 false loop terminate   Tc 19
}													
}													
