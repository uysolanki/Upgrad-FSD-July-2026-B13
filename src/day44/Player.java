package day44;

public class Player {

	
	private int pno;
	private String playerName;
	private int matchesPlayed;
	private int runScored;
	private int cathesTaken;
	private int wicketsTaken;
	private int trophiesWon;
	private String country;
	public Player() {}
	public Player(int pno, String playerName, int matchesPlayed, int runScored, int cathesTaken, int wicketsTaken,
			int trophiesWon, String country) {
		this.pno = pno;
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.runScored = runScored;
		this.cathesTaken = cathesTaken;
		this.wicketsTaken = wicketsTaken;
		this.trophiesWon = trophiesWon;
		this.country = country;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
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
	public int getRunScored() {
		return runScored;
	}
	public void setRunScored(int runScored) {
		this.runScored = runScored;
	}
	public int getCathesTaken() {
		return cathesTaken;
	}
	public void setCathesTaken(int cathesTaken) {
		this.cathesTaken = cathesTaken;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	public int getTrophiesWon() {
		return trophiesWon;
	}
	public void setTrophiesWon(int trophiesWon) {
		this.trophiesWon = trophiesWon;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Player [pno=" + pno + ", playerName=" + playerName + ", matchesPlayed=" + matchesPlayed + ", runScored="
				+ runScored + ", cathesTaken=" + cathesTaken + ", wicketsTaken=" + wicketsTaken + ", trophiesWon="
				+ trophiesWon + ", country=" + country + "]";
	}
	
	
}
