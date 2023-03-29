package myProjects.footballCupScoreBoard.classes;

public abstract class Team {

	private int score; 
	private String name;
	public Locality locality;
	public Locality getLocality() {
		return locality;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public Team() {
		this.score = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
