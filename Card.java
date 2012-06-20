
public class Card {

	int number;
	boolean forward;
	boolean split;
	boolean swap;
	boolean outOfStart;
	boolean sorry;
	boolean goAgain;
	String name;
	String description;
	
	/**
	 * Creates a new card.
	 * @param number
	 * @param forward
	 * @param split
	 * @param swap
	 * @param outOfStart
	 * @param sorry
	 * @param goAgain
	 * @param name
	 * @param description
	 */
	public Card(int number, boolean forward, boolean split, boolean swap, boolean outOfStart, boolean sorry, boolean goAgain, String name, String description) {
		this.number = number;
		this.forward = forward;
		this.split = split;
		this.swap = swap;
		this.outOfStart = outOfStart;
		this.sorry = sorry;
		this.goAgain = goAgain;
		this.name = name;
		this.description = description;
	}
	
	/**
	 * 
	 * @param cardStuff
	 */
	public Card(String[] cardStuff) {
		this(Integer.parseInt(cardStuff[0]), Boolean.parseBoolean(cardStuff[1]), Boolean.parseBoolean(cardStuff[2]),
				Boolean.parseBoolean(cardStuff[3]), Boolean.parseBoolean(cardStuff[4]), Boolean.parseBoolean(cardStuff[5]),
				Boolean.parseBoolean(cardStuff[6]), cardStuff[0], cardStuff[7]);
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public void setForward(boolean forward) {
		this.forward = forward;
	}
	public void setSplit(boolean split) {
		this.split = split;
	}
	public void setSwap(boolean swap) {
		this.swap = swap;
	}
	public void setOutOfStart(boolean outOfJail) {
		this.outOfStart = outOfJail;
	}
	public void setSorry(boolean sorry) {
		this.sorry = sorry;
	}
	public void setGoAgain(boolean goAgain) {
		this.goAgain = goAgain;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getNumber() {
		return number;
	}
	public boolean isForward() {
		return forward;
	}
	public boolean isSplit() {
		return split;
	}
	public boolean isSwap() {
		return swap;
	}
	public boolean isOutOfStart() {
		return outOfStart;
	}
	public boolean isSorry() {
		return sorry;
	}
	public boolean isGoAgain() {
		return goAgain;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	

	
	
}
