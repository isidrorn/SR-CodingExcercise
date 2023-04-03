package myProjects.footballCupScoreBoard.classes;

public class AwayTeam extends Team{

	public AwayTeam(String name) {
		this.locality = Locality.AWAY;
		super.setName(name);
	}
	
	//Make sure team name cannot be changed at runtime nor overridden
	@Override
	public final void setName(String s) throws NoSuchMethodError{
		throw new NoSuchMethodError("You cant modify a Team's name after creation");
	}
}
