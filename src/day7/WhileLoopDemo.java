package day7;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		
		
		int i=1; //initialization								//i   						output
		
																//1    is 1<=5 true			Welcome		
		while(i<=5) //condition									//2    is 2<=5 true			Welcome
		{														//3    is 3<=5 true         Welcome
			System.out.println("Welcome");						//4    is 4<=5 true			Welcome
			i=i+1;												//5    is 5<=5 true			Welcome
		}														//6	   is 6<=5 false loop terminate
	}

}
