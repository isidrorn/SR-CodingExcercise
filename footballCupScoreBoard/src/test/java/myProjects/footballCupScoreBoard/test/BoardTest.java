package myProjects.footballCupScoreBoard.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import myProjects.footballCupScoreBoard.classes.AwayTeam;
import myProjects.footballCupScoreBoard.classes.Board;
import myProjects.footballCupScoreBoard.classes.Game;
import myProjects.footballCupScoreBoard.classes.HomeTeam;
import myProjects.footballCupScoreBoard.classes.Team;

public class BoardTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

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
	public final void testUpdateScore() {
		Board b = new Board();
		Game g;
		g = b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		b.updateScore(1, 0, g);
		assertTrue(b.getGames().get(0).getTotalScore() > 0);
	}

	@Test
	public final void testGetSummary() {
		Board b = new Board();
		Game g;
		g = b.startGame(new HomeTeam("Spain"), new AwayTeam("Portugal"));
		b.updateScore(1, 0, g);
		Game g2;
		g2 = b.startGame(new HomeTeam("France"), new AwayTeam("Germany"));
		b.updateScore(1, 2, g2);
		
		System.out.println(b.getSummary());
	}

}
