package collectionrevision.day7;

public class StepClimbing {
public static void main(String[] args) {
	int n=4;
	                         // G 1 2 3 4
	int dp[]=new int[n+1];   //[0,1,2,3,5]
	
	dp[1]=1;
	dp[2]=2;
	
	for(int i=3;i<=n;i++)
	{
		dp[i]=dp[i-1]+dp[i-2];
	}
	
	System.out.println("Different ways to climb a stricase of "+ n + " steps are " + dp[dp.length-1]);
}
}
