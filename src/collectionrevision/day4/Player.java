package collectionrevision.day4;

import java.util.List;

public class Player implements Comparable<Player>{

    private int jerseyNumber;
    private String playerName;
    private int matchesPlayed;
    private int runsScored;
    private int catchesTaken;
    private int wicketsTaken;
    private int fours;
    private int sixes;
    private int centuries;
    private String category;
    private List<String> trophies;
    
    private double battingAverage;

    // Default Constructor
    public Player() {
    }

    // Parameterized Constructor
    public Player(int jerseyNumber, String playerName, int matchesPlayed,
                  int runsScored, int catchesTaken, int wicketsTaken,
                  int fours, int sixes, int centuries,
                  String category, List<String> trophies) {

        this.jerseyNumber = jerseyNumber;
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
        this.catchesTaken = catchesTaken;
        this.wicketsTaken = wicketsTaken;
        this.fours = fours;
        this.sixes = sixes;
        this.centuries = centuries;
        this.category = category;
        this.trophies = trophies;
    }

    // Getters and Setters

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getCatchesTaken() {
        return catchesTaken;
    }

    public void setCatchesTaken(int catchesTaken) {
        this.catchesTaken = catchesTaken;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getCenturies() {
        return centuries;
    }

    public void setCenturies(int centuries) {
        this.centuries = centuries;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getTrophies() {
        return trophies;
    }

    public void setTrophies(List<String> trophies) {
        this.trophies = trophies;
    }

    @Override
    public String toString() {
        return "Player{" +
                "jerseyNumber=" + jerseyNumber +
                ", playerName='" + playerName + '\'' +
                ", matchesPlayed=" + matchesPlayed +
                ", runsScored=" + runsScored +
                ", catchesTaken=" + catchesTaken +
                ", wicketsTaken=" + wicketsTaken +
                ", fours=" + fours +
                ", sixes=" + sixes +
                ", centuries=" + centuries +
                ", category='" + category + '\'' +
                ", trophies=" + trophies +
                '}';
    }
    
    public void calculateBattingAverage()
    {
    	battingAverage=runsScored/matchesPlayed;
    }

	public double getBattingAverage() {
		return battingAverage;
	}

//	@Override											//comparing based on name in ASC order
//	public int compareTo(Player p1) {
//		return playerName.compareTo(p1.playerName);
//	}
	
	
//	@Override											//comparing based on averages in ASC order
//	public int compareTo(Player p1) {
//		if(this.getBattingAverage()>p1.getBattingAverage())
//			return 1;
//		else if(this.getBattingAverage()<p1.getBattingAverage())
//			return -1;
//		else return 0;
//	}
	
//	@Override											//comparing based on averages in DESC order
//	public int compareTo(Player p1) {
//		if(this.getBattingAverage()>p1.getBattingAverage())
//			return -1;
//		else if(this.getBattingAverage()<p1.getBattingAverage())
//			return 1;
//		else return 0;
//	}
    
	
	@Override											//comparing based on wicketsTaken in DESC order
	public int compareTo(Player p1) {
		if(this.wicketsTaken>p1.wicketsTaken)
			return -1;
		else if(this.wicketsTaken<p1.wicketsTaken)
			return 1;
		else return 0;
	}
    
}