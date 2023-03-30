package myProjects.footballCupScoreBoard.classes;

public class HomeTeam extends Team{

	public HomeTeam(String name) {
		this.locality = Locality.HOME;
		super.setName(name);
	}
	
	//Make sure team name cannot be changed at runtime
	@Override
	public void setName(String s) throws NoSuchMethodError{
		throw new NoSuchMethodError("You cant modify a Team's name after creation");
	}
}
