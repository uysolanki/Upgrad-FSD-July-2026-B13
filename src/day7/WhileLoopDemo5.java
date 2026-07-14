package day7;

public class WhileLoopDemo5 {

	public static void main(String[] args) {
		
		
		
		int i=5; //initialization								//i   						output
		
																//5    is 5>=1 true			Welcome5		
		while(i>=1) //condition									
		{														//3    is 3>=1 true         Welcome3
			System.out.println("Welcome"+i);					
			i=i-2;												//1    is 1>=1 true			Welcome1
		}														//-1   is -1>=1 false loop terminate
	}

}

/*

Welcome5
Welcome3
Welcome1

*/