package collectionrevision.day4;

import java.util.Arrays;

public class MinCricketTeamsPossible {

	public static void main(String[] args) {
		int players[]= {5,4,4,3};
		int s=5;
		
		int max=maxPossibleTeams(players,s);
		System.out.println(max==-1? "No teams Possible" : max + "teams possible");
		

	}

	private static int maxPossibleTeams(int[] players, int s) {
		
		int start=0;
		int end=Arrays.stream(players).sum();
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(teamsPossible(mid,s,players))
			{
				if(teamsPossible(mid+1,s,players))
				{
					start=mid+1;
				}
				return mid;
			}
			else
			{
				end=mid-1;
			}
		}
		
		return -1;
	}

	private static boolean teamsPossible(int mts, int s, int[] players) {
		int requiredPlayers=mts*s;
		
		int avaliblePlayers=0;
		
		for(int n:players)
			avaliblePlayers+=Math.min(mts, n);
		
		
		if(avaliblePlayers>=requiredPlayers)
			return true;
		else
			return false;
	}

}
