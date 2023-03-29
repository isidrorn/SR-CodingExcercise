package myProjects.footballCupScoreBoard.classes;

import java.util.ArrayList;

// Assumptions: 
// Since it isn't stated how many concurrent Boards can exist I will leave it as a normal POJO 
// but I have been tempted to use a singleton pattern in order to ensure the library's user does not
// mess around with different boards 
public class Board implements IBoard {

	private ArrayList<Game> games = new ArrayList<Game>();
	
	//private Summary summary = new Summary();

	
	public void finishGame(Game g) {
		getGames().remove(g);

	}

	public ArrayList<Game> getGames() {
		return games;
	}

	
	public String getSummary() {
		StringBuilder str = new StringBuilder();
		ArrayList<Game> summary = new ArrayList<Game>();
		
		summary.stream();
		// 1. order by highest score in new list 
		// 2. get positions (the highest the most recent)   with such score
		// finally order new list as per step 2 
			// remove  matching elements (must be first  N of the list), add in index order 
			// ej: if elements 1, 3 and 7 have highest score, after 1st step they will be placed in 0,1,2 "randomly"
			// insert 7 in 0, 3 in 1, 1 in 2
		
		
		
		getGames().forEach(g -> {
			str.append(g.toString()).append(System.lineSeparator());
			
		});
		
		return str.toString();
	}
	
	public Game startGame(HomeTeam ht, AwayTeam at) {
		Game g = new Game(ht,at);
		getGames().add(g);
		return g;
	
	}

	
	// In my opinion I would have rather pass both Team objects as parameters instead of their scores 
	public void updateScore(int homeScore, int awayScore, Game gm) {
		getGames().forEach(
				g -> {
					if (g.getGameName().equals(gm.getGameName())) {
						g.getHomeTeam().setScore(homeScore);
						g.getAwayTeam().setScore(awayScore);
						
		}});
		
	}

}
