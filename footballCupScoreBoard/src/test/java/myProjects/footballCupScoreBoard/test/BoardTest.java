package myProjects.footballCupScoreBoard.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import myProjects.footballCupScoreBoard.classes.AwayTeam;
import myProjects.footballCupScoreBoard.classes.Board;
import myProjects.footballCupScoreBoard.classes.Game;
import myProjects.footballCupScoreBoard.classes.HomeTeam;

public class BoardTest {


	@Test
	public final void testStartGame() {
		Board b = new Board();
		b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		assertTrue(b.getGames().size() > 0 && b.getGames().get(0).getTotalScore() == 0);
	}

	@Test
	public final void testFinishGame() {
		Board b = new Board();
		Game g;
		g = b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		b.finishGame(g);
		assertTrue(b.getGames().isEmpty());
	}
	
	@Test
	public final void testFinishGame2() {
		Board b = new Board();
		Game g;
		g = b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		Game g2;
		g2 = b.startGame(new HomeTeam("Italy"), new AwayTeam("Japan"));
		b.finishGame(g);
		assertTrue(b.getGames().size() == 1 && b.getGames().get(0).getGameName().equals(g2.getGameName()));
	}

	@Test
	public final void testUpdateScore() {
		Board b = new Board();
		Game g;
		g = b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		b.updateScore(1, 0, g);
		assertTrue(b.getGames().get(0).getTotalScore() > 0);
	}
	
	@Test
	public final void testUpdateScoreDataIntegrity() throws InterruptedException {
		Board b = new Board();
		Game g;
		g = b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		b.updateScore(1, 0, g);
		Game g2;
		g2 = b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		//Thread.sleep(1000);
		b.updateScore(1, 0, g2);
		
		assertTrue(b.getGames().get(0).getTotalScore() == 1);
		assertTrue(b.getGames().get(1).getTotalScore() == 1);
	}

	@Test
	public final void testGetSummary() {
		Board b = new Board();
		Game g;
		g = b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		b.updateScore(10, 10, g);
		Game g2;
		g2 = b.startGame(new HomeTeam("Morocco"), new AwayTeam("Italy"));
		b.updateScore(1, 0, g2);
		Game g3;
		g3 = b.startGame(new HomeTeam("France"), new AwayTeam("Germany"));
		b.updateScore(18, 2, g3);
		Game g4;
		g4 = b.startGame(new HomeTeam("Brazil"), new AwayTeam("Netherlands"));
		b.updateScore(1, 1, g4);
		Game g5;
		g5 = b.startGame(new HomeTeam("England"), new AwayTeam("Scotland"));
		b.updateScore(5, 15, g5);
		Game g6;
		g6 = b.startGame(new HomeTeam("Wales"), new AwayTeam("Denmark"));
		b.updateScore(2, 2, g6);
		
		System.out.println("Initial status:");
		
		StringBuilder str = new StringBuilder();
		b.getGames().forEach(s -> {str.append(s).append(System.lineSeparator());});

		System.out.println(str);
		
		System.out.println("Summary:");
		System.out.println(b.getSummary());
		
		
		assertTrue(b.getGames().get(0).equals(g5));
		assertTrue(b.getGames().get(1).equals(g3));
		assertTrue(b.getGames().get(2).equals(g));
		assertTrue(b.getGames().get(3).equals(g6));
		assertTrue(b.getGames().get(4).equals(g4));
		assertTrue(b.getGames().get(5).equals(g2));
		
	}

}
