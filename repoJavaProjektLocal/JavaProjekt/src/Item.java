
public class Item {

	private String name;
	private int hp;//health points
	private int exp;//experience points
	private int ap; //Action Points
	
	public String getName() {
		return name;
	}
	
	
	//Die Methode könnte ich gut gebrauchen
	@Override 
	public boolean equals(Object obj) {
		if((((Item) (obj)).getName()).contentEquals(this.getName()))
			return true;
		return false;
	}
}
