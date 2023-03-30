package myProjects.footballCupScoreBoard.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import myProjects.footballCupScoreBoard.interfaces.IBoard;

// Assumptions: 
// Since it isn't stated how many concurrent Boards can exist I will leave it as a normal POJO 
// but I have been tempted to use a singleton pattern in order to ensure the library's user does not
// mess around with different boards 
public class Board implements IBoard {

	private ArrayList<Game> games = new ArrayList<Game>();
	
	public void finishGame(Game g) {
		getGames().remove(g);

	}

	public ArrayList<Game> getGames() {
		return games;
	}

	
	public String getSummary() {
		StringBuilder str = new StringBuilder();
		ArrayList<Game> summary = getGames();
		Collections.reverse(summary);
		
		summary = getGames().stream()
				  .sorted(Comparator.comparing(Game::getTotalScore).reversed())
				  .collect(Collectors.toCollection(ArrayList::new));
		
		summary.forEach(g -> {
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
