import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;


public class Game {

	Space[] allSpaces;
	Player[] players;
	Pawn[] allPawns; //Note: Pawn 0 - pawnsPerPlayer is for player 0, pawnsPerPlayer + 1 - 2 * pawnsPerPlayer etc.
	ArrayList<Card> allCards = new ArrayList<Card>();
	ArrayList<Card> cardsToDraw = new ArrayList<Card>();
	StartSpace[] allStartingSpaces;


	Random generator = new Random(); //***A better way to do random?
	
	final Color[] colors = { Color.red, Color.blue, Color.green, Color.yellow };
	final int[] startSpaces = { 3, 17, 31, 45 };
	final int numOfSpaces = 55;
	int pawnsPerPlayer;
	int place; //First place, second place, etc.
	
	Player currentPlayer;
	Pawn selectedPawn;
	Card drawnCard;
	
	
	int numOfSpacesToMove;
	
	
	
	/* Game Play */
	
	/**
	 * TODO: **** IMPLEMENT DJ DS:L JDS
	 */
	public void nextTurn() {
		
	}
	
	
	public void turn() {
		if (cardsToDraw.size() == 0) { setupCards(); } //Reset cards if there are no more.
		drawnCard = drawCard();
		activateEffect();
	}
	
	public void activateEffect() {
		
		
		
		if (drawnCard.isGoAgain()) { turn(); }
	}
	
	
	
	
	/**
	 * Draws a card returns the card drawn.
	 */
	public Card drawCard() {
		int temp = generator.nextInt(cardsToDraw.size());
		return cardsToDraw.remove(temp);
	}
	
	/**
	 * ***TODO: OMGOMGOMOGMOGM
	 * @param pawn
	 */
	public void selectPawn(int pawn) {
		
	}
	
	
	/* Setup Game */
	
	public Game(String filename, int numOfPlayers, int numOfPawns) throws NullGameException {
		this(filename);
		setupPlayers(numOfPlayers, numOfPawns);
	}
	
	public Game(String filename) throws NullGameException {
		@SuppressWarnings("unused")
		Parser parser = new Parser(filename, this);
		setupCards();
		setupOriginalSpaces();
	}
	
	
	public void setupPlayers(int numOfPlayers, int numOfPawns) {
		allStartingSpaces = new StartSpace[numOfPlayers];
		for (int i = 0; i < allStartingSpaces.length; i = i + 1) { allStartingSpaces[i] = new StartSpace(colors[i], startSpaces[i]); }
		players = new Player[numOfPlayers];
		for (int i = 0; i < players.length; i = i + 1) { players[i] = new Player(colors[i], allStartingSpaces[i]); }
		allPawns = new Pawn[numOfPawns * numOfPlayers];
		setupPawns();
		for (int i = 0; i < players.length; i = i + 1) {
			for (int j = numOfPawns * i; j < numOfPawns * i + numOfPawns; j = j + 1) {
				players[i].addPawn(allPawns[j]);
			}
		}
		
	}
	
	public void addPlayerName(String name) {
		for (int i = 0; i < players.length; i = i + 1) {
			if (players[i].getName() == null) { players[i].setName(name); break; }
		}
	}
	
	/**
	 * Adds 'card' to this game.
	 * @param card Card to add to this game.
	 */
	public void addCard(Card card) {
		allCards.add(card);
	}
	
	/**
	 * Sets up the card to draw from by adding all the cards from all of the cards.
	 */
	public void setupCards() {
		for (int i = 0; i < allCards.size(); i = i + 1) {
			cardsToDraw.add(allCards.get(i));
		}
	}
	
	/**
	 * Sets the number of pawns per player.
	 * @param pawnsPerPlayer Number of pawns per player.
	 */
	public void setNumberOfPawns(int pawnsPerPlayer) {
		this.pawnsPerPlayer = pawnsPerPlayer;
	}
	
	public void setupPawns() {
		for (int i = 0; i < allPawns.length; i = i + 1) {
			allPawns[i] = new Pawn(colors[i/players.length]);
		}
	}
	
	public void setupOriginalSpaces() {
		allSpaces = new Space[numOfSpaces];
		int slideSpaces[] = { 0, 8, 14, 22, 28, 36, 42, 50 };
		for (int i = 0; i < numOfSpaces; i = i + 1) { allSpaces[i] = new Space(); }
		for (int i = 0; i < slideSpaces.length; i = i + 1) { allSpaces[slideSpaces[i]] = new SlideSpace(colors[i/2]); }
	}

	
}
