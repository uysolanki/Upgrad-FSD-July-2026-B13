package day45;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		String str1="prajwal";
		Stack<Character> stack=new Stack();								
		for(char ch:str1.toCharArray())
		{
			stack.push(ch);
		}
	  System.out.println(stack);					//z					//  n  		 4 <----top
	      int flag=0;                                          //n
	  for(char ch:str1.toCharArray())
	  {
		  char z=stack.pop();
		  if(ch!=z)
		  {
			flag=1;
			break;
		  }
	  }
	  
	  if(flag==1)
		  System.out.println("Not Palindrome");
	  else
		  System.out.println("Palindrome");
	}																	//	i		 3
																		//	t		 2 
}																		//	i		 1   
																		//	n		 0	
//{[()]}		 well formed												//			-1    
//{[(])}		 not well formed	