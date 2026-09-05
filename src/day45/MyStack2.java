package day45;

import java.util.Scanner;

public class MyStack2 {

	private static  int stack[]=new int[5];
	private static int top=-1;              //top==-1 stack empty
	
	
	public static void main(String[] args) {
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
		case 1:	  if(isFull())	
					{
						System.out.println("Stack is Full");
					}
		else {
					top++;
					System.out.println("Enter data to push");
					int data=sc.nextInt();
					stack[top]=data;
		}
		break;
		
		case 2 : if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			int data=stack[top];
			System.out.println(data + " is Popped");
			top--;
		}
		break;
		
		case 3 : if(isEmpty())
		{
			System.out.println("Stack is Empty, Nothing to display");
		}
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]);
		}
		break;
		
		}
		
		}while(choice!=0);
	}
	

	public static boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public static boolean isFull()
	{
		if(top==stack.length-1)
			return true;
		else
			return false;
	}

}
