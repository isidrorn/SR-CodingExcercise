package myProjects.footballCupScoreBoard.classes;

public class Game {

	private int totalScore;
	private HomeTeam homeTeam;
	private AwayTeam awayTeam;
	
	public Game(HomeTeam ht, AwayTeam at) {
		this.homeTeam = ht;
		this.awayTeam = at;
	}
	
	public int getTotalScore() {
		return this.homeTeam.getScore() + this.awayTeam.getScore();
	}
	
	
}
