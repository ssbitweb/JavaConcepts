package OOPConceptsPart1;

// Q . How to access private variable in another class?

// -- using java reflection

public class Woman {

	private String boobs;

	public Woman(String boobs) { // constructor to initialize instance/class variables
		this.boobs = boobs;
	}
	
	public String getS() { // getter-- to get data
		return boobs;
	}
	
}


