package day7;

public class WhileLoopDemo3 {

	public static void main(String[] args) {
		
		
		
		int i=1; //initialization								//i   						output
		
																//1    is 1<=5 true			Welcome1		
		while(i<=5) //condition									
		{														//3    is 3<=5 true         Welcome3
			System.out.println("Welcome"+i);					
			i=i+2;												//5    is 5<=5 true			Welcome5
		}														//7	   is 7<=5 false loop terminate
	}

}

/*

Welcome1
Welcome3
Welcome5

*/