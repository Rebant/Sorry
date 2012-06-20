import java.awt.Color;


public class SlideSpace extends Space {
	
	int slideIncrement;
	Color color;
	
	public SlideSpace(Color color) {
		this.color = color;
	}
	
	public boolean canSlide() {
		return (currentPawn == null ? false : currentPawn.getColor() == color);
	}
	
	

}
