package day45;

import java.util.Scanner;

public class MyStack3 {

	private static int stack[] = new int[5];
	private static int top = -1; // top==-1 stack empty

	static void push() {
		Scanner sc = new Scanner(System.in);
		top++;
		System.out.println("Enter data to push");
		int data = sc.nextInt();
		stack[top] = data;
	}

	static void pop() {
		int data = stack[top];
		System.out.println(data + " is Popped");
		top--;
	}

	static void display() {
		for (int i = top; i >= 0; i--)
			System.out.println(stack[i]);
	}

	public static boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public static boolean isFull() {
		if (top == stack.length - 1)
			return true;
		else
			return false;
	}

}
