import java.awt.Color;
import java.util.ArrayList;


public class StartSpace {

	Color color;
	ArrayList<Pawn> allPawns = new ArrayList<Pawn>(); //Pawns in this start space.
	int toSpace;
	
	public StartSpace(Color color, int toSpace) {
		this.color = color;
		this.toSpace = toSpace;
	}
	
	public boolean hasPawns() { return allPawns.size() == 0; }
	
	public void setupAllPawns(Pawn[] pawns) {
		for (int i = 0; i < pawns.length; i = i + 1) { allPawns.add(pawns[i]); }
	}
	
	public void removePawn(Pawn pawn) {
		allPawns.remove(pawn);
	}
	
	public void addPawn(Pawn pawn) {
		allPawns.add(pawn);
	}
	
}
