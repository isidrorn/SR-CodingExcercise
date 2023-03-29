package myProjects.footballCupScoreBoard.classes;

public class Game {

	private AwayTeam awayTeam;
	private HomeTeam homeTeam;
	private String gameName;
	
//	private int totalScore;

	public Game(HomeTeam ht, AwayTeam at) {
		this.homeTeam = ht;
		this.awayTeam = at;
		setGameName(ht.getName() + " " + at.getName());
	}

	public AwayTeam getAwayTeam() {
		return awayTeam;
	}
	
	public HomeTeam getHomeTeam() {
		return homeTeam;
	}
	
	public int getTotalScore() {
		return this.homeTeam.getScore() + this.awayTeam.getScore();
	}
	
//	public void setTotalScore() {
//		this.totalScore = this.homeTeam.getScore() + this.awayTeam.getScore();
//	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(getHomeTeam().getName() 
				+ " " 
				+ getHomeTeam().getScore()
				+ " - "
				+ getAwayTeam().getName()
				+ " "
				+ getAwayTeam().getScore());
		
		return str.toString();
	}

	public String getGameName() {
		return gameName;
	}

	private void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
