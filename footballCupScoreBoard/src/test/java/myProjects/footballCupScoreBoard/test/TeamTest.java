package myProjects.footballCupScoreBoard.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import myProjects.footballCupScoreBoard.classes.AwayTeam;
import myProjects.footballCupScoreBoard.classes.HomeTeam;
import myProjects.footballCupScoreBoard.classes.Locality;

public class TeamTest {

	@Test
	public final void testAwayTeam() {
		//fail("Not yet implemented");
		AwayTeam at = new AwayTeam("Morocco");
		System.out.println("Locality = " + at.getLocality());
		System.out.println("Score = " + at.getScore());
		assertTrue(at.locality.equals(Locality.AWAY));
		assertTrue(at.getScore() == 0);
		assertFalse(at.getName().isEmpty());
	}
	
	@Test
	public final void testHomeTeam() {
		//fail("Not yet implemented");
		HomeTeam ht = new HomeTeam("Morocco");
		System.out.println("Locality = " + ht.getLocality());
		System.out.println("Score = " + ht.getScore());
		assertTrue(ht.locality.equals(Locality.AWAY));
		assertTrue(ht.getScore() == 0);
		assertFalse(ht.getName().isEmpty());
	}
	
	

	

}
