package myProjects.footballCupScoreBoard.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import myProjects.footballCupScoreBoard.classes.AwayTeam;
import myProjects.footballCupScoreBoard.classes.Locality;

public class AwayTeamTest {

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
	public final void testAwayTeam() {
		//fail("Not yet implemented");
		AwayTeam at = new AwayTeam();
		System.out.println("Locality = " + at.getLocality());
		System.out.println("Score = " + at.getScore());
		assertTrue(at.locality.equals(Locality.AWAY));
		assertTrue(at.getScore() == 0);
	}

	@Test
	public final void testGetScore() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetScore() {
		fail("Not yet implemented");
	}

	@Test
	public final void testTeam() {
		fail("Not yet implemented");
	}

}
