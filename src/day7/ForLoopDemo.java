package day7;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		
		
																//i   						output
		
																//5    is 5>=1 true			Welcome5		
		for(int i=5;i>=1;i=i-2) //condition									
		{														//3    is 3>=1 true         Welcome3
			System.out.println("Welcome To The Jungle"+i);					
																//1    is 1>=1 true			Welcome1
		}														//-1   is -1>=1 false loop terminate
	}

}

/*

Welcome5
Welcome3
Welcome1

*/