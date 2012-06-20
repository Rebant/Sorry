import java.awt.Color;
import java.util.ArrayList;


public class Player {

	String name;
	ArrayList<Pawn> pawnsOwned = new ArrayList<Pawn>(); //***Make into table or something for O(1) lookup
	Color color;
	StartSpace startingSpace;
	int place = -1;
	
	public Player(Color color, StartSpace startingSpace) {
		this.color = color;
		this.startingSpace = startingSpace;
	}
	
	
	public boolean ownsPawn(Pawn pawn) {
		for (int i = 0; i < pawnsOwned.size(); i = i + 1) { if (pawnsOwned.get(i) == pawn) return true; }
		return false;
	}
	
	public void addPawn(Pawn pawn) {
		pawnsOwned.add(pawn);
		startingSpace.addPawn(pawn);
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setPlace(int place) {
		this.place = place;
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	
	
	
}
