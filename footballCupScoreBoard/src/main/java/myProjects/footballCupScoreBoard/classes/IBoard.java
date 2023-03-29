package myProjects.footballCupScoreBoard.classes;

public interface IBoard {

	public Game startGame(HomeTeam ht, AwayTeam at) ;
		//return new Game(ht,at);
	
	public void finishGame(Game g);
	
	//Needed to add the Game to the method parameters else how would it know what game to update? 
	public void updateScore(int homeScore, int awayScore, Game g);
	
	public String getSummary();
}
