package myProjects.footballCupScoreBoard.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import myProjects.footballCupScoreBoard.classes.AwayTeam;
import myProjects.footballCupScoreBoard.classes.HomeTeam;
import myProjects.footballCupScoreBoard.classes.Locality;

public class TeamTest {

	@Test
	public final void testAwayTeam() {
		AwayTeam at = new AwayTeam("Morocco");
		assertTrue(at.locality.equals(Locality.AWAY));
		assertTrue(at.getScore() == 0);
		assertFalse(at.getName().isEmpty());
	}
	
	@Test
	public final void testHomeTeam() {
		HomeTeam ht = new HomeTeam("Morocco");
		assertTrue(ht.locality.equals(Locality.HOME));
		assertTrue(ht.getScore() == 0);
		assertFalse(ht.getName().isEmpty());
	}
	
	@Test(expected = NoSuchMethodError.class)
	public final void testTeamNotModifiable() {
		AwayTeam fat = new AwayTeam("test");
		fat.setName("BOOM!");
		
	}
	
	
	

	

}
