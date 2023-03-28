package myProjects.footballCupScoreBoard.classes;

public interface IBoard {

	public Game startGame(HomeTeam ht, AwayTeam at) ;
		//return new Game(ht,at);
	
	public void finishGame(Game g);
	
	public Game updateScore(int homeScore, int awayScore);
	
	public Summary getSummary();
}
