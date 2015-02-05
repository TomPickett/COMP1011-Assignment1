//Thomas Pickett

public class Superhero extends Hero {
	//Properties
	private String superPowers;

	
	//Constructor
	public Superhero(String name) {
		super(name);
		
		generateRandomPowers();
		
	}

	//Private Methods
	private void generateRandomPowers() {
		
	}
	
	
	//Public Methods
	public void showPowers() {
		System.out.println(name + " super powers are: " + superPowers);
	}
}
