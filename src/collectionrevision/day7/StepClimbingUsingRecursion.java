package collectionrevision.day7;

public class StepClimbingUsingRecursion {
public static void main(String[] args) {
	int n=4;
	
	int max =countMaxWays(n);
	
	System.out.println("Different ways to climb a stricase of "+ n + " steps are " + max);
}

private static int countMaxWays(int n) {

	if(n==1)
		return 1;
	else if(n==2)
		return 2;
	else return countMaxWays(n-1) + countMaxWays(n-2);		
}
}
