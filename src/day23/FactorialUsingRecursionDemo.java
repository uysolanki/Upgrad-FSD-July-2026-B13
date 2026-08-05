package day23;

public class FactorialUsingRecursionDemo {

	public static void main(String[] args) {
		int n=5;
		int ans=factorial(n);
		if(n>0)
		System.out.println(ans);
		else
			System.out.println("Invalid Input");

	}

	private static int factorial(int n) {
		if(n==1)
			return 1;
		return n*factorial(n-1); 
	}

}
