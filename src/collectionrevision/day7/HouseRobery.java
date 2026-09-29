package collectionrevision.day7;

public class HouseRobery {
public static void main(String[] args) {
	//int houses[]= {2,5,3,8};			    //      0 1 2 3 4 
	int houses[]= {7,5,2,8,3};			    //dp = [7,7,9,15,15]
	int dp[]=new int[houses.length];	
	
	dp[0]= houses[0];
	dp[1]= Math.max(houses[0], houses[1]);
	
	for(int i=2;i<houses.length;i++)
	{
		int take= houses[i]+ dp[i-2]; //12
		int leave = dp[i-1];		  //15
		
		dp[i]= Math.max(take, leave);
	}
	
	System.out.println("Max "+ dp[dp.length-1]);
}
}
