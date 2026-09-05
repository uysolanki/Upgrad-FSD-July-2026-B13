package day45;

import java.util.Scanner;

public class StackDriver {

	public static void main(String[] args) {
		
		MyStack3 stack=new MyStack3();
		
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("**** Stack Menu *****");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Display");
		System.out.println("0. Exit");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:	  if(stack.isFull())
				  System.out.println("Stack is Full");
				  else
			      stack.push();
				  break;
		case 2:	  if(stack.isEmpty())
			  System.out.println("Stack is Empty");
			  else
		      stack.pop();
			  break;
		case 3:	  if(stack.isEmpty())
			  System.out.println("Stack is Empty");
			  else
		      stack.display();
			  break;
		case 0 : System.exit(0);
		
		default : System.out.println("Invalid choice");
		}
		
		
		}while(choice!=0);
	}
}
