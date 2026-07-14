package day7;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		
		
		int i=1; //initialization								//i   						output
		
																//1    is 1<=5 true			Welcome1		
		while(i<=5) //condition									//2    is 2<=5 true			Welcome2
		{														//3    is 3<=5 true         Welcome3
			System.out.println("Welcome"+i);					//4    is 4<=5 true			Welcome4
			i=i+1;												//5    is 5<=5 true			Welcome5
		}														//6	   is 6<=5 false loop terminate
	}

}

/*

Welcome1
Welcome2
Welcome3
Welcome4
Welcome5

*/