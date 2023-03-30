package myProjects.footballCupScoreBoard.interfaces;

import myProjects.footballCupScoreBoard.classes.AwayTeam;
import myProjects.footballCupScoreBoard.classes.Game;
import myProjects.footballCupScoreBoard.classes.HomeTeam;

public interface IBoard {

	public Game startGame(HomeTeam ht, AwayTeam at) ;
	
	public void finishGame(Game g);
	
	//Needed to add the Game to the method parameters else how would it know what game to update? 
	public void updateScore(int homeScore, int awayScore, Game g);
	
	public String getSummary();
}
