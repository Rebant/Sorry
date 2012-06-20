import java.awt.Color;


public class Pawn {

	Color color;
	int onSpace;
	boolean inStart;
	boolean inHomeBlock;
	boolean inHome;
	
	
	public Pawn(Color color) {
		this.color = color;
		inStart = true;
	}
	
	
	/**
	 * Increments the space this pawn is on.
	 */
	public void incrementSpace() {
		onSpace++;
	}
	
	/**
	 * Swaps the space of this pawn and pawnToSwitchWith.
	 * @param pawnToSwitchWith Pawn to switch with.
	 */
	public void swapPawn(Pawn pawnToSwitchWith) {
		swapSpot(pawnToSwitchWith);
	}
	
	/**
	 * Puts this pawn on a space.
	 * @param onSpace Which space to put it on.
	 */
	public void setSpace(int onSpace) {
		this.onSpace = onSpace;
	}
	
	/**
	 * Swaps the spots of this pawn and pawnToSwitchWith.
	 * @param pawnToSwitchWith Pawn to switch spots with.
	 */
	public void swapSpot(Pawn pawnToSwitchWith) {
		int temp = onSpace;
		setSpace(pawnToSwitchWith.getSpace());
		pawnToSwitchWith.setSpace(temp);
	}
	
	/**
	 * @param inHome True if in home, false otherwise.
	 */
	public void setInHome(boolean inHome) {
		this.inHome = inHome;
	}
	
	/**
	 * @param inHomeBlock True if in home squares, false otherwise.
	 */
	public void setInHomeBlock(boolean inHomeBlock) {
		this.inHomeBlock = inHomeBlock;
	}
	
	/**
	 * @param color Color of this pawn.
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
	/**
	 * @return Color of this pawn.
	 */
	public Color getColor() {
		return color;
	}
	
	public int getSpace() {
		return onSpace;
	}
	
	
}
