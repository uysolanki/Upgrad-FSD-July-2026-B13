package day7;

public class WhileLoopDemo4 {

	public static void main(String[] args) {
		
		
		
		int i=5; //initialization								//i   						output
		
																//5    is 5>=1 true			Welcome5		
		while(i>=1) //condition									//4    is 4>=1 true			Welcome4
		{														//3    is 3>=1 true         Welcome3
			System.out.println("Welcome"+i);					//2    is 2>=1 true         Welcome2
			i=i-1;												//1    is 1>=1 true			Welcome1
		}														//0	   is 0>=1 false loop terminate
	}

}

/*

Welcome5
Welcome4
Welcome3
Welcome2
Welcome1

*/