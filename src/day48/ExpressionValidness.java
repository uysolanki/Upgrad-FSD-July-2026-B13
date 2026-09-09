package day48;

import java.util.Stack;

public class ExpressionValidness {

	public static void main(String[] args) {
	//String expression="{[()]}";
	//	String expression="{[(])}";
//		String expression="}[(])}";
		String expression="{[()]";
		
		if(expression==null || expression.length()==0 ||  expression.length()%2==1)
		System.out.println("Invalid Expression");
		else
		System.out.println(checkValidity(expression)?"Valid":"Not Valid");

	}

	private static boolean checkValidity(String expression) {
		Stack<Character> stack=new Stack();
																// (    <--top
		for(char ch:expression.toCharArray())					// [
		{														// {
			if(ch=='{'|| ch=='[' || ch=='(')
			{
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			switch(ch)
			{
			case ')' :  if(stack.pop()!='(')
						return false;
						break;
			case ']': 	if(stack.pop()!='[')
						return false;
						break;
			case '}': 	if(stack.pop()!='{')
						return false;
						break;
			}
			
			
		}
		return stack.isEmpty();
	}

}
