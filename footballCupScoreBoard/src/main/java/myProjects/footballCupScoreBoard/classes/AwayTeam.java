package myProjects.footballCupScoreBoard.classes;

public class AwayTeam extends Team{

	public AwayTeam() {
		this.locality = Locality.AWAY;
	}
	
	public AwayTeam(String name) {
		this.locality = Locality.AWAY;
		this.setName(name);
	}
}
