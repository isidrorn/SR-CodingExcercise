package myProjects.footballCupScoreBoard.classes;

import java.time.LocalDateTime;
import java.util.Objects;

public class Game {

	private AwayTeam awayTeam;
	private HomeTeam homeTeam;
	private String gameName;
	private LocalDateTime gameDate;
	
	public Game(HomeTeam ht, AwayTeam at) {
		this.homeTeam = ht;
		this.awayTeam = at;
		setGameName(ht.getName() + " " + at.getName());
		setGameDate(LocalDateTime.now());
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

	public LocalDateTime getGameDate() {
		return gameDate;
	}

	private void setGameDate(LocalDateTime gameDate) {
		this.gameDate = gameDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gameDate, gameName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Game))
			return false;
		Game other = (Game) obj;
		return Objects.equals(gameDate, other.gameDate) && Objects.equals(gameName, other.gameName);
	}
	

}
